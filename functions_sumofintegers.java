import java.util.*;
public class functions_sumofintegers {
    public static int digitsum(int number){
        int sum=0;
        // int d=number;
        int temp=0;
        while(number>0){
            temp=number%10;
            sum=sum+temp;
            number=number/10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int number=sc.nextInt();
        System.out.println("the sum of numbers is" + digitsum(number));
    }
}
