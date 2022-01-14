public class LC326_PowerOfThree {
    public static void main(String[] args) {
        System.out.println(powerOfThree(243));
    }

    static boolean powerOfThree(int n){
        if(n < 0){
            return false;
        }

        if((Math.log10(n)/Math.log10(3))%1 == 0){
            return true;
        }

        return false;
    }
}
