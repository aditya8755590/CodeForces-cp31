import java.util.Scanner;

public class twoOrThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            
            int n=sc.nextInt();
           System.out.println(sol(n,0));
        }
    }
    public static int sol(int n,int pos){
        if(n%3==0){
            return n/3;
        }
        int a,b;
        if(n%2==0){
          a=n/2;
        }
        else if(n%3==0){
            b=n/3;
        }

        int ans=n/3+(int)Math.ceil((n%3)/(double)2);
        return ans;
        
    }
    
}
