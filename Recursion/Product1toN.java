public class Product1toN {
    public static void main(String[] args) {
        System.out.println(product(5));
    }

    public static int product(int n){
        if(n == 1){
            return 1;
        }
        return n * product(n-1);
    }
}
