public class TrianglePatternRecursion {
    public static void main(String[] args) {
        printTriangle(4,4);
    }

    public static void printTriangle(int r, int c) {
        if(r == 0){
            return;
        }
        else if(c > 0){
            System.out.print("* ");
            printTriangle(r, c-1);
        }
        else if(c == 0){
            System.out.println();
            printTriangle(r-1, r-1);
        }
    }
}
