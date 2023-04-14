import java.util.Scanner;

public class largestelementarray {
    public static int largest(int arr[],int n){
        int max=0;
        arr[0]=max;
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(largest(arr, n));
    }
}
