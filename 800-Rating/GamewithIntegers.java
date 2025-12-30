import java.util.Scanner;

public class GamewithIntegers {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0){
        int n=sc.nextInt();
        System.out.println(integers(n));
        t--;
    }
    sc.close();
    }
    public static String integers(int n){
        if(n%3==0){
            return "Second";
        }
        return "First";

    }
}
