public class ReverseDigitsRecursion {
    public static void main(String[] args) {
        int num = 980461;
        System.out.println(reverse(num));
    }

    public static int reverse(int num) {
        int base = (int)Math.log10(num); //This gives the numberOfDigits-1
        if(base == 0){
            return num;
        }
        return num%10 * (int)Math.pow(10,base) + reverse(num/10);
    }
}
