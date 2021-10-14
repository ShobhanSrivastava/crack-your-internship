public class CountNumberOfZeroes {
    public static void main(String[] args) {
        
        System.out.print(countZeroes(80047007));
    }

    public static int countZeroes(int num) {
        if((int)Math.log(num) == 0)
            return (num%10==0)?1:0;
        return (num%10==0)?1:0 + countZeroes(num/10);
    }
}
