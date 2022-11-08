import java.util.Scanner;
import java.util.*;

public class reverse_number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int numbers=sc.nextInt();
        int count=0;
        while(numbers != 0){
            numbers=numbers/10;
            count++;
        }
        int n=0;
        for(int i=count; i>0; i--){
            n= i;
        }
        System.out.println(n);
    }
}
