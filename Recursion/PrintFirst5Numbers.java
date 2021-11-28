public class PrintFirst5Numbers {
    public static void main(String[] args) {
        PrintNumbers(1);
    }

    public static void PrintNumbers(int n) {
        if(n==5){
            System.out.println(n);
        }
        else{
            System.out.println(n);
            PrintNumbers(n+1);
        }
    }
}
