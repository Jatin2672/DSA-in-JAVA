import java.util.Scanner;
import java.util.*;

public class digitcount_array {
    public static int CountDigitNumbers(int arr[], int n, int k){
        arr = new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i] % 10==k){
                count++;
            }
            // return count;
        }
        System.out.println(count);
        return count;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("ENTER THE DIGIT");
        int k=sc.nextInt();
        CountDigitNumbers(arr, n, k);
    }
}
