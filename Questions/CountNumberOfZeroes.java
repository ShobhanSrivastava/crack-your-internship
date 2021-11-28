public class CountNumberOfZeroes {

    static int count = 0;
    public static void main(String[] args) {
        countZeroes(80047007);
        System.out.println(count);
    }

    public static void countZeroes(int num) {
        if(num>0){
            if(num%10 == 0){
                count++;
            }
            countZeroes(num/10);
        }
        else
            return;
    }
}
