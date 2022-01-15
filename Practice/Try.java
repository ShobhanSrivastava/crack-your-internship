import java.util.Scanner;
public class Try {
    public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
          	int a = sc.nextInt();
          	int b = sc.nextInt();
          	int n = sc.nextInt();
          	
          	System.out.println(fibo(a, b, n));
		}
	}
	
	static int fibo(int a, int b, int n){
        if(n == 0){
            return a;
        }
        else if(n == 1){
            return b;
        }
	    return fibo(a, b, n-1) ^ fibo(a, b, n-2);
	}
}
