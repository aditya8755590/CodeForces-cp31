import java.util.HashMap;
import java.util.Scanner;

public class DoremyPaint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(calculate(arr, n));
            t--;
        }
        sc.close();
    }

    public static String calculate(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
            if(map.size()==1) return "Yes";
            if(map.size()>2) return "NO";
            int[] freq = new int[2];
            int idx = 0;
            for (int v : map.values()) {
                freq[idx++] = v;
            }
            return Math.abs(freq[0] - freq[1]) <= 1 ? "YES" : "NO";
        }
    }
