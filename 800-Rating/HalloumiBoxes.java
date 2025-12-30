import java.util.Scanner;

public class HalloumiBoxes {
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
        System.out.println(sort(arr,n,k));
        t--;
    }
    sc.close();
   }
   public static String sort(int[] arr,int n,int k){
     if(AlradySorted(arr,n)){
      return "YES";
     }
     if(k==1){
      return "NO";
     }
     return "YES";

   }
   public static boolean AlradySorted(int[] arr,int n){
      for(int i=0;i<n-1;i++){
          if(arr[i]>arr[i+1]){
            return false;
          }

      }
      return true;
   }
    
}