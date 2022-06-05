// { Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			System.out.println(obj.atoi(str));
		t--;
		}
	}
}// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String str) {
	    boolean neg = (str.charAt(0) == '-') ? true : false;
	    int start = neg ? 1 : 0;
	    
	    int result = 0;
	    for(int i=start ; i<str.length() ; i++){
	        result *= 10;
	        char ch = str.charAt(i);
	        if(ch >= 48 && ch <= 57){
	            result += ch-'0';
	        }else{
	            return -1;
	        }
	    }
	    
	    if(neg){
	        return result*-1;
	    }
	    
	    return result;
    }
}
