import java.util.*;
public class countdigits_function {
    public static int digitcount(int n){
        int count =0;
        while(n != 0){
            n =n /10;
            count++;
        }
        return count;
        
    }
    public static void main(String args[]){
        System.out.println("Enter the numbe to count the digit :");
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println("the number of digits present in the given number is :" + digitcount(number));
        

    }
}
