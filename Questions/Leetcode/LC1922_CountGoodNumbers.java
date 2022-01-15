public class LC1922_CountGoodNumbers {
    public static void main(String[] args) {
        System.out.println(goodNumbers(50));
    }

    public static long goodNumbers(long n){
        long modNumber = (long)Math.pow(10, 9) + 7;
        long evenPlaces = (long)Math.pow(5, n - n/2);
        long oddPlaces = (long)Math.pow(4, n/2);
        return (evenPlaces%modNumber * oddPlaces%modNumber)%modNumber;
    }
}
