public class SumOfDigitsRecursion {
    public static void main(String[] args) {
        System.out.println(SumOfDigits(12345));
    }

    static int SumOfDigits(int n){
        if(n == 0){
            return 0;
        }
        return n%10 + SumOfDigits(n/10);
    }
}
