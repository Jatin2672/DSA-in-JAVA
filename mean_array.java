import java.util.*;
public class mean_array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++){
             sum= sum + numbers[i];
        }
        double avg= sum / size;
        System.out.println("The mean of the numbers in :" + avg);
    }
}
