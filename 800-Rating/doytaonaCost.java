import java.util.Scanner;

public class doytaonaCost {
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
    public static String calculate(int[] arr,int n,int k){
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                return "Yes";
            }
        }
        return "NO";
    }
}
