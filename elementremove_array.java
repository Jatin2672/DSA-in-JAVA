import java.util.ArrayList;
import java.util.Scanner;

public class elementremove_array {
    public static void main(String args[]){
        ArrayList<Integer> listnumber = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the arraylist :");
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            listnumber.add(sc.nextInt()); 
        }
        System.out.println(listnumber);
        System.out.print("Enter the element to be removed :");
        int number=sc.nextInt();
        listnumber.get(number);
        listnumber.remove(number);
        System.out.println(listnumber);
    }
}
