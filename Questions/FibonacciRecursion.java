public class FibonacciRecursion {
    public static void main(String[] args) {
        int nthFibo = recFibo(6);
        System.out.println(nthFibo);
    }

    public static int recFibo(int n){
        if(n<2){
            return n;
        }
        return recFibo(n-1)+recFibo(n-2);
    }
}


