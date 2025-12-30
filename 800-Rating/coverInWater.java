import java.util.Scanner;
import java.util.concurrent.*;
public class coverInWater {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0){
        int n=sc.nextInt();
        String s=sc.next();
        System.out.println(fillWater(s,n));
        t--;
    }
    sc.close();
    }
    public static int fillWater(String s,int n){
        int total=0;
        int consecutive=0;
        // if we fount cosecutinve 3 or more so 
        // it conferm it take only 2 
        for(int i=0;i<n;i++){
            char ch =s.charAt(i);
            if(ch=='.'){
                total++;
                consecutive++;
                if (consecutive>=3) {
                return 2;
            }
            }
            else{
                consecutive=0;
            }

        }
        return total;
    }
    
}