public class armstrongNumber {
    public static void main(String args[]){
        int number =153;
        int count=0;
        int sum=0;
        while( number!=0){
            number=number/10;
            count++;
        }
        // System.out.println("number of digits :" +count);
        
        for(int i=0;i<count;i++){
            sum= sum + (i^count);
        }
        // System.out.println("the sumof powers is :" + sum);
        if(sum==number){
            System.out.println("the number is armstrong number ");
        }
    }
}
