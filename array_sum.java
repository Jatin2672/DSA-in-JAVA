import java.util.*;
public class array_sum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum +=numbers[i];
           
        }
        System.out.println("sum of array is :" + sum);


    }
}
