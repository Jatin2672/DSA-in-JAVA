public class powXusingrecursion {
    public static int calcpow(int x, int n){
        if(x==0){
            return 1;
        }
        if(n==0){
            return 0;
        }
        // int xpownm1=calcpow(x,n-1);
        // int xpown=x*xpownm1;
        // return xpown;
        // alternative
        if(x%2==0){
            return calcpow(x,n/2) * calcpow(x,n/2);
        }
        else{
            return  calcpow(x,n/2) * calcpow(x,n/2)* x;
        }

    }
    public static void main(String args[]){
        int x=3;
        int n=4;
        int ans = calcpow(x, n);
        System.out.println(ans);
    }
}
