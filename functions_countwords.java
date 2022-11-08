
import java.util.Scanner;

public class functions_countwords {
    // public static int words(String str){
    //     int count=0;
    //     return str.length();
    // }
    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     Sy/stem.out.print("Input the string");
    //     String str=sc.nextLine();
    //     System.out.println("the no of words in string is :" + words(str));
    // }
    public static int words(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        return count+1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input the string");
        String str=sc.nextLine();
        System.out.println("the no of words in string is :" + words(str));
    }
}
