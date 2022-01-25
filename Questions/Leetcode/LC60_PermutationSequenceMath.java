public class LC60_PermutationSequenceMath {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }

    public static String permutation(int n, int k, int place, String str, int[] qbFact){
        if(place == 0){
            return str;
        }

        int fact = factorial(place-1);
    }

    public static int factorial(int n){
        System.out.println(n);
        if(n == 0){
            return 1;
        }

        int fact = n * factorial(n-1);

        return fact;
    }
}
