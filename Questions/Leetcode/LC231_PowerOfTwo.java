public class LC231_PowerOfTwo {
    public static void main(String[] args) {
        int num = 64;
        System.out.println("Power of Two : "+isPowerOfTwo(num));
    }
    
    public static boolean isPowerOfTwo(int n) {

        /*Brute Force Approach - TLE

        int result = 1;
        while(result<=n){
            if(result==n){
                return true;
            }
            result<<=1;
        }
        return false;*/

        if (n <= 0)
            return false;
        else if ((n & n - 1) == 0)
            return true;
        else
            return false;

    }
}
