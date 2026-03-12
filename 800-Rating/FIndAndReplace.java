import java.util.HashSet;
import java.util.Scanner;

public class FIndAndReplace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
             sc.nextLine();
            String s=sc.nextLine();
            String res=sol(s,n)?"Yes":"No";
            System.out.println(res);
        }

    }
    public static boolean sol(String s,int n){
        HashSet<Character> set=new HashSet<>();

        for(int i=0;i<n;i+=2){
            set.add(s.charAt(i));
          }
        for(int i=1;i<n;i+=2){
           if(set.contains(s.charAt(i))) return false;
          }
          return true;
        }
    }

