import java.util.Scanner;
public class trailingzerosInFactorial {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int factnum=sc.nextInt();
        int fact=1;
        for(int i=0;i<factnum;i++){
             fact=fact*(factnum-i);
        }
        System.out.println(fact);
        int count=0;
        while(fact !=0){
            int digit=fact%10;
            if(digit == 0){
                count++;
            }
            fact=fact/10;
        }
        System.out.println("the number of trailing zeros present in factorial is :" + count);
    }
}
