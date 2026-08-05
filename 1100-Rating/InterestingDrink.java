import java.util.Arrays;
import java.util.Scanner;

public class InterestingDrink {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
       int q=sc.nextInt();
       while(q-->0){
        int cap=sc.nextInt();
        sol(arr,cap);
       }

    }
    public static void sol(int[] arr,int cap){
      int i=0;
      int j=arr.length;
      while(i<j){
        int mid=i+(j-i)/2;
        if(arr[mid]<=cap){
            i=mid+1;
        }
        else{
            j=mid;
        }
      }
      System.out.println(i);
    }
}
