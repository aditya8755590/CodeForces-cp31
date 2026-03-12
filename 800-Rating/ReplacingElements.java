import java.util.Scanner;
public class ReplacingElements {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(solve(arr, k));
        }
    }

    private static String solve(int[] arr, int k) {
        // what is the error in this code
        int n=arr.length;
       int firstSmall = Integer.MAX_VALUE;
int secondSmall = Integer.MAX_VALUE;
int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<firstSmall){
                secondSmall = firstSmall;
                firstSmall = arr[i];
            }else if(arr[i]<secondSmall){
                secondSmall = arr[i];
            }
                max=Math.max(max, arr[i]);
        }
       if(max<=k){
           return "Yes";
       }
       return firstSmall+secondSmall<=k?"YES":"NO";

    }
}
