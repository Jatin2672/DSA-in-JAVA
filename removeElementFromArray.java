import java.util.*;
import java.util.Arrays;
public class removeElementFromArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        // System.out.println(Arrays.tostring(arr));
        System.out.println("Enter the number to be removed");
        int number=sc.nextInt();
        int removeindex=0;
        for(int i=0;i<size;i++){
            if(number==arr[i]){
                removeindex=i;
            }
        }
        for(int i=removeindex;i<arr.length-1;i++){
            arr[i]=arr[i+1];
            System.out.println(arr[i]);
        }
        
        
    }
}
