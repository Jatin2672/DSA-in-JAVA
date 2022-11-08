
import java.util.Scanner;

public class functions_middlestring {
    public static String midstr(String str){
        int position;
        int length;
        if(str.length() % 2==0){
            position=str.length()/2 -1;
            length=2;
        }
        else{
            position=str.length()/2;
            length=1;
        }
        return str.substring(position,position+length);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a string :");
        String str=sc.nextLine();
        System.out.println("the middle character of the string is :" + midstr(str));
    }
    
}
