import java.util.Scanner;

public class  AdjacentDigitSums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while (k-->0) {
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x>y&&x%9==0&&y==1) System.out.println("Yes");
        else if(y>x&&y-x==1) System.out.println("Yes");
        else  System.out.println("No");}

    }
}
