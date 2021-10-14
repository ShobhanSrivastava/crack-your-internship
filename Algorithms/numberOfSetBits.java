public class numberOfSetBits {
    public static void main(String[] args) {
        int num = 128;
        System.out.println("The number of setBits = "+setBits(num));
    }

    public static int setBits(int num) {

        int count = 0;
        while(num>0){
            count++;
            num = num & (num-1);
        }

        return count;
    }
}
