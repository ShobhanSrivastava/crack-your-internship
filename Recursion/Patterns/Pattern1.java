public class Pattern1 {
    public static void main(String[] args) {
        pattern1(5);
    }

    public static void pattern1(int n) {
        if(n == 0){
            return;
        }
        pattern1(n-1);
        System.out.println();
        printStar(n);
    }
    
    public static void printStar(int n) {
        if(n == 0){
            return;
        }
        System.out.print("* ");
        printStar(--n);
    }
}
