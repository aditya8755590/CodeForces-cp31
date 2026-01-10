import java.util.Scanner;

public class UnitedWeStand {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0){
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
        }
        // System.out.println(calculate(arr,n));
        calculate(arr,n);
        t--;
    }
    sc.close();
    }
    public static void calculate(int [] arr,int n){
        // all are positive 
        int big=arr[0];
        int small=arr[0];
        int bigPos=0;
        for(int k=0;k<n;k++){
            int i=arr[k];
            if(i>big){
                big=i;
                bigPos=k;
            }
            big=Math.max(big,i);
            small=Math.min(small,i);
        }
        if(big==small){
            System.out.println("-1");
            return ;
        }
         System.out.print(n-1+" ");
         System.out.println(1);
         for(int i=0;i<n;i++){
            if(i!=bigPos){
                System.out.print(arr[i]+" ");
            }
         }
         System.out.println();
          System.out.println(arr[bigPos]);
    }
}
