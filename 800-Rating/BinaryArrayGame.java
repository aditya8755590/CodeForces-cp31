import java.util.Scanner;

public  class BinaryArrayGame{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0){
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
        }
        System.out.println(calculate(arr,n));
        t--;
    }
    sc.close();
    }
    public static String calculate(int[] arr,int n){
        int z=0,one=0;
        for(int i:arr){
            if(i==0) z++;
            if(i==1) one++;
        }
        if(one>=z){
            return "Alice";
        }
        return "Bob";
    }
}
