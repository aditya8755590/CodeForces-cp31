import java.util.Scanner;
public class Buttons {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       while (n > 0) {
           int a = sc.nextInt();
           int b = sc.nextInt();
           int c = sc.nextInt();
           System.out.println(numTimes(a, b, c));
           n--;
       }
    }
    public static String numTimes(int a, int b, int c) {
        if(a==b){
            return c%2==0 ? "Second" : "First";
        }
        else {
            return a > b ? "First" : "Second";
        }
    }
}
