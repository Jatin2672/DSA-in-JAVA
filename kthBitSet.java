import java.util.Scanner;

public class kthBitSet {
    public static void kthbit(int n,int k){
        n=0;
        k=0;
        if((n & (1<<(k-1))) !=0){
            System.out.println("yes the kth bit is 1");
        }
        else{
            System.out.println("No the kth bit is not 1");
        }
        return;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        kthbit(n, k);
    }
}
