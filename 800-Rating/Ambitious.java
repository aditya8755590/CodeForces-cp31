import java.util.Scanner;

public class Ambitious {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    //int t=sc.nextInt();
    // while(t>0){
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
        }
        System.out.println(calculate(arr,n));
        // t--;
    // }
    // sc.close();
    // }
    }
    public static int calculate(int[] arr,int n){
      int min=100001;
      for(int i:arr){
        min=Math.min(Math.abs(i),min);
      }
      return min;

    }
}
