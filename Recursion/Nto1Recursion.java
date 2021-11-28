public class Nto1Recursion {
    public static void main(String[] args) {
        printNto1(6);
    }

    static void printNto1(int N){
        if(N == 1){
            System.out.println(N);
            return;
        }
        System.out.println(N);
        printNto1(N-1);
    }
}
