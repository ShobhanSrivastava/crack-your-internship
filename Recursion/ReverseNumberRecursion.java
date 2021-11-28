public class ReverseNumberRecursion {
    public static void main(String[] args) {
        System.out.println(reverse(54321));
    }

    static int reverse(int n){
        int base = (int)Math.log10(n) + 1;

        if(base == 1){
            return n;
        }
        return n%10*(int)Math.pow(10, base-1) + reverse(n/10);
    }
}
