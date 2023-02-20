//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s1 = sc.next();
                    String s2 = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.minOperations(s1,s2));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
	public int minOperations(String str1, String str2) 
	{ 
	    int len1 = str1.length(), len2 = str2.length();
	    Integer[][] table = new Integer[len1+1][len2+1];
	    return minOps(table, str1, str2, len1, len2);
	} 
	
	public int minOps(Integer[][] table, String str1, String str2, int i, int j) {
	    if(i == 0) return j;
	    if(j == 0) return i;
	    
	    if(table[i][j] != null) return table[i][j];
	    
	    if(str1.charAt(i-1) != str2.charAt(j-1)) {
	        int ins = 1 + minOps(table, str1, str2, i, j-1);
	        int del = 1 + minOps(table, str1, str2, i-1, j);
	        
	        return table[i][j] = Math.min(ins, del);
	    }
	    else {
	        return table[i][j] = minOps(table, str1, str2, i-1, j-1);
	    }
	}
}