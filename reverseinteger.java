public class reverseinteger {
    public static void main(String[] args) {
        int number =579;
        int reverse=0;
        int digit=0;
        while(number !=0){
            digit=number%10;
            reverse =reverse*10 + digit;
            number=number/10;
        }
        System.out.println(reverse);
    }
}
