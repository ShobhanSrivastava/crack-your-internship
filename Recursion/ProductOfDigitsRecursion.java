public class ProductOfDigitsRecursion {
    public static void main(String[] args) {
        System.out.println(ProductOfDigits(12345));
    }

    static int ProductOfDigits(int n) {
        if (n == 0) {
            return 1;
        }
        return n % 10 * ProductOfDigits(n / 10);
    }
}
