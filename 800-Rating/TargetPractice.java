import java.util.*;
public class TargetPractice{

   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0){
        int n=10;
        char[][] grid=new char[n][n];
        for(int i=0;i<n;i++){
            String s=sc.next();
            for(int j=0;j<n;j++){
                grid[i][j]=s.charAt(j);
            }
        }
        System.out.println(calculate(grid,n));
        t--;
    }
    sc.close();
    }
    public static int calculate(char[][] grid,int n){
        int score=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='X'){
                    score+=Math.min(i+1,Math.min(j+1,Math.min(n-i,n-j)));
                }
            }
        }
        return score;   
    } 
    }