import java.util.Scanner;
public class ALineTrip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0){
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
        }
        System.out.println(calculate(arr,n,k));
        t--;
    }
    sc.close();
    }
    public static int calculate(int[] arr,int n,int k){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int dis=i!=0?arr[i]-arr[i-1]:arr[0];
            ans=Math.max(ans,dis);
        }

        int last=arr[n-1];
        ans=Math.max(ans,((k-last)*2));
        return ans;
    }
}
