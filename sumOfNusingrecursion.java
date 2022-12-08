import java.util.*;
public class sumOfNusingrecursion {
    public static void printsum(int n,int i,int sum){
        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        printsum(n, i+1, sum);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        printsum(n, 1, sum);
    }
}
