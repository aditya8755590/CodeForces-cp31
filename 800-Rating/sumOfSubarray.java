import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class sumOfSubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         System.out.println(Arrays.toString(arr)+"k->"+ k+"n->"+n);
        System.out.print(sol(arr,k));
    }
    public static int sol(int[] arr, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int i = 0, j = 0, n = arr.length;

    int sum = 0;
    int result = 0; // empty subarray allowed → answer ≥ 0

    while (j < n) {

        // include current element
        sum += arr[j];
        map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);

        // shrink window if distinct elements > k
        while (map.size() > k) {
            sum -= arr[i];
            map.put(arr[i], map.get(arr[i]) - 1);

            if (map.get(arr[i]) == 0) {
                map.remove(arr[i]);
            }
            i++;
        }

        // update maximum sum
        result = Math.max(result, sum);

        j++;
    }

    return result;
}
}
