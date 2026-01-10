import java.util.Scanner;

public class goalsOfAVictory {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0){
        int n=sc.nextInt();
        int[] arr=new int[n-1];
        for(int i=0;i<n-1;i++){
         arr[i]=sc.nextInt();
        }
        System.out.println(calculate(arr));
        t--;
    }
    sc.close();
    }
    public static int  calculate(int[] arr){
      int sum=0;
      for(int i:arr){
        sum+=i;
      }
      return 0-sum;
    }
}
