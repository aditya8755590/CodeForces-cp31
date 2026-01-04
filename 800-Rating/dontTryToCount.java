import java.util.Scanner;

public class dontTryToCount {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0){
        int n=sc.nextInt();
        int m=sc.nextInt();
        String x=sc.next();
        String s=sc.next();
        System.out.println(solution(n,m,x,s));
        t--;
    }
    sc.close();
    }
    public static int solution(int n,int m,String x,String s ){
        int count=0;
        if(x.contains(s)) return count;
        while(count<=5){
            x+=x;
            count++;
            if(x.contains(s)) return count;
        }
        return -1;
    }

}
