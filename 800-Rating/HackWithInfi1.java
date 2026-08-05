import java.util.Scanner;

public class HackWithInfi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Read n
        int n = sc.nextInt();
        // 2. Read array A
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        // 3. Read number of queries
        int q = sc.nextInt();
        // 4. Read queries
        int[][] queries = new int[q][4];
        for (int i = 0; i < q; i++) {
            queries[i][0] = sc.nextInt(); // l
            queries[i][1] = sc.nextInt(); // r
            queries[i][2] = sc.nextInt(); // x
            queries[i][3] = sc.nextInt(); // y
        }
        // 👉 Call solution
        Solution sol = new Solution();
        long answer = sol.solve(A, queries);
        // 👉 Print result
        System.out.println(answer);
        sc.close();
    }   
}
class Solution {
    static final long MOD = 1_000_000_007;
    // Segment Tree arrays
    long[] tree;   // stores sum of range
    long[] lazyA;  // stores constant part (a)
    long[] lazyB;  // stores coefficient of i (b)
    int n;

    public long solve(int[] A, int[][] queries) {
        n = A.length;

        tree = new long[4 * n];
        lazyA = new long[4 * n];
        lazyB = new long[4 * n];

        // Build initial segment tree
        build(0, 0, n - 1, A);

        // Process all queries
        for (int[] q : queries) {
            int l = q[0], r = q[1];
            long x = q[2], y = q[3];

            // Convert into form: A[i] = a + b*i
            long a = (x - (long) l * y) % MOD;
            if (a < 0) a += MOD;

            long b = y % MOD;

            update(0, 0, n - 1, l, r, a, b);
        }

        // Final sum is stored at root
        return tree[0];
    }

    // Build segment tree from initial array
    void build(int node, int start, int end, int[] A) {
        if (start == end) {
            tree[node] = A[start];
            return;
        }

        int mid = (start + end) / 2;
        build(2 * node + 1, start, mid, A);
        build(2 * node + 2, mid + 1, end, A);

        tree[node] = (tree[2 * node + 1] + tree[2 * node + 2]) % MOD;
    }

    // Apply lazy update to a node
    void apply(int node, int start, int end, long a, long b) {
        // Sum of (a + b*i) for i = start to end
        long len = end - start + 1;
        // Sum of i from start to end
        long sumIndices = (long)(start + end) * len / 2 % MOD;

        // Total contribution = a*len + b*(sum of indices)
        long total = (a * len % MOD + b * sumIndices % MOD) % MOD;

        // Overwrite the segment
        tree[node] = total;

        // Store lazy values
        lazyA[node] = a;
        lazyB[node] = b;
    }

    // Push lazy values to children
    void push(int node, int start, int end) {
        if (lazyA[node] == 0 && lazyB[node] == 0) return;

        int mid = (start + end) / 2;

        // Push to left child
        apply(2 * node + 1, start, mid, lazyA[node], lazyB[node]);

        // Push to right child
        apply(2 * node + 2, mid + 1, end, lazyA[node], lazyB[node]);

        // Clear current lazy
        lazyA[node] = 0;
        lazyB[node] = 0;
    }

    // Update range [l, r]
    void update(int node, int start, int end, int l, int r, long a, long b) {
        // No overlap
        if (end < l || start > r) return;
        // Complete overlap
        if (l <= start && end <= r) {
            apply(node, start, end, a, b);
            return;
        }
        // Partial overlap → push lazy first
        push(node, start, end);
        int mid = (start + end) / 2;
        update(2 * node + 1, start, mid, l, r, a, b);
        update(2 * node + 2, mid + 1, end, l, r, a, b);
        // Update current node
        tree[node] = (tree[2 * node + 1] + tree[2 * node + 2]) % MOD;
    }
}
