import java.util.Scanner;
public class OddGrasshopper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t>0){
            long x=sc.nextLong();
            long n=sc.nextLong();
            System.out.println(solve(x,n));
            t--;
        }        
        sc.close();
    }
    // explanation solution what are we doing
    // We are determining the final position of the grasshopper after 'n' jumps.
    // The grasshopper's movement depends on whether its current position is odd or even.
    // The function 'solve' implements this logic using modular arithmetic to find the final position.
    // we analyse by looking at the pattern of jumps for both odd and even starting positions and how they evolve over time.
    // for x=0->0,1,0,-2,0,3,0,-4,0,5
    // for x=2->2,3,1,-4,2,5,-3,6,2,-5
    
    // for x=1->1,2,0,-3,1,4,-2,5,1,-4
    // for x=3->3,4,2,-5,3,6,-4,7,3,-6


    public static long solve(long x,long n){

        if(x%2==0){
                if(n%4==0){
                    return x;
                }
                else if(n%4==1){
                    return x-n;
                }
                else if(n%4==2){
                    return x+1;
                }
                else{
                    return x+n+1;
                }
        }
        else{
            if(n%4==0){
                return x;
            }
            else if(n%4==1){
                return x+n;
            }
            else if(n%4==2){
                return x-1;
            }
            else{
                return x-n-1;
            }
        }
    }

}
