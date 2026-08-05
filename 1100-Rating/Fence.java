import java.util.Scanner;

public class Fence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
       int ans=-1;
       int j=0;
       int min=Integer.MAX_VALUE;
       int curr=0;
        for(int i=0;i<n;i++){
            curr+=arr[i];

            if(i-j+1==k){
             if(curr<min){
                ans=1+j;
                min=curr;
             }
             curr-=arr[j];
             j++;
            }
        }
        System.out.println(ans);
       }
}
