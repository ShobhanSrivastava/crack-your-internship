public class SumOfDigitsRecursion {

    public static void main(String[] args) {
        int num = 435;
        int sum = sumOfDigits(num);
        System.out.println(sum);
    }

    public static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }
    
}
