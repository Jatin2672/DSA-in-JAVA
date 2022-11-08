import java.util.*;
public class countdigit {
    public static void main(String args[]){
        System.out.println("Enter the number whose digit is to be counted :");
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        int count=0;
        while(number != 0){
            number=number/10;
            count++;
        }
        System.out.println("the number of digits present in the given number is :" + count);

    }
}
