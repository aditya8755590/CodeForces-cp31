import java.util.*;

public class CardboardforPictures {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            long total=sc.nextLong();
            long[] arr=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }
            int l=0,r=(int)Math.sqrt(total);
            int ans=0;

            while(l<=r){
                int mid=l+(r-l)/2;
                boolean val=value(mid,arr,total);
                if(val){
                    ans=mid;
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }

            System.out.println(ans);

        }
        
    }
    public static boolean value(int x,long[] arr,long total){
         long ans=0;
         for(int i=0;i<arr.length;i++){
              ans+=(arr[i]+(2*x))*(arr[i]+(2*x));
             if(ans>total) return false;

         }
         return true;
    }
    
}
