import java.util.Scanner;

public class JaggedSwaps {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0){
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
        }
        System.out.println(valid(arr,n));
        t--;
    }
    sc.close();
    }
    public static String valid(int[] arr,int n){
        if(arr[0]!=1){
            return "NO";
        }
        return "YES";
    }
}
