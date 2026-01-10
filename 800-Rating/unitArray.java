import java.util.Scanner;
public class unitArray {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0){
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
        }
        System.out.println(calculate(arr,n));
        t--;
    }
    sc.close();
    }
    public static int calculate(int[] arr,int n){
        int countN=0;
        int countP=0;
        int ops = 0;
    if (countP < countN) {
        int diff = countN - countP;
        ops = (diff + 1) / 2;  
        countN -= ops;
    }
    if (countN % 2 != 0) {
        ops++;
    }

    return ops;
    }
}
