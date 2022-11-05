import java.util.*;
import java.util.Arrays;
public class array_sort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("orignal numeric array :" + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("sorted numeric arrays :" + Arrays.toString(numbers));
    }
}
