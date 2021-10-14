public class nthMagicNumber {
    public static void main(String[] args) {
        int num = 3;
        int sum = 0, base=5;
        while(num!=0){
            int last = num&1;
            sum += last * base;
            base*=5;
            num>>=1;
        }
        System.out.println(sum);
    }
}
