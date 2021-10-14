public class ithBit {
    public static void main(String[] args) {
        int bit = 100000010;
        int mask = 1<<4;
        
        System.out.println("ith bit of the given number is : " + ((bit&mask)>>4));
    }
}
