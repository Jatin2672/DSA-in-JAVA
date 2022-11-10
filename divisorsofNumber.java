import java.util.*;
public class divisorsofNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        // int count=0;
        // int divisor=0;
        int temp=number;
        for(int i=1;i<=temp;i++){
            if(number%i==0){
                System.out.println(i);
            }
        }
        }
    }

