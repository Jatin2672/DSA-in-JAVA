import java.util.Scanner;

import java.util.*;
public class checknumber_array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int number[]=new int[size];
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        
        }
        System.out.println("Enter the number to be searched");
        int x=sc.nextInt();
        for(int i=0;i<size;i++){
            if(x==number[i]){
                System.out.println("Numbar found at index :" + i);
            }
            // }else{
            //     System.out.println("number not found");
            // }
        }
    }
}
