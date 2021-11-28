public class HelloWorldRecursion {
    public static void main(String[] args) {
        printHelloWorldNTimes(5);
    }

    public static void printHelloWorldNTimes(int n){
        if(n == 1){
            System.out.println("Hello World");
        }
        else{
            System.out.println("Hello World");
            printHelloWorldNTimes(n-1);
        }
    }
}
