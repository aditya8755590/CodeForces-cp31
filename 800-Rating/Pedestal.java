import java.util.*;

public class Pedestal {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            
            int n=sc.nextInt();
           sol(n);
        }
    }
    public static void sol(int n){
        int a=n/3-1;
        int b=n/3+1;
        int c=n/3+(n%3);
        if(b==c){
          b=b-1;
          c=c+1;
        }
        int []arr={a,b,c};

        Arrays.sort(arr);
        System.out.println(arr[1]+" "+arr[2]+" "+arr[0]);        
    }
    }
