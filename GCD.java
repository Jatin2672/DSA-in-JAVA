import java.util.*;
public class GCD {
    public static int gcd(int a , int b){
        int c=Math.min(a,b);
        while(c>0){
            if(a%c==0 && b%c==0){
                break;
            }
            c--;   
        }
        return c;
    }
    public static void main(String args[]){
        int a=15;
        int b=10;
        System.out.println(gcd(a, b));
    }
}

// NAIVE METHOD !!!!!!
