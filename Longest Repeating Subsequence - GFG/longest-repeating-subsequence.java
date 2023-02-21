//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.LongestRepeatingSubsequence(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        int len = str.length();
        Integer[][] table = new Integer[len+1][len+1];
        
        // for(int i=0 ; i<=len1 ; i++) {
        //     table[0][i] = 0;
        //     table[i][0] = 0;
        // }
        
        int result = lcs(table, str, len, len);
        
        return result;
    }
    
    public int lcs(Integer[][] table, String str, int len1, int len2) {
        if(len1 == 0 || len2 == 0) return 0;
        
        if(table[len1][len2] != null) return table[len1][len2];
        
        if(str.charAt(len1-1) == str.charAt(len2-1) && len1 != len2) {
            table[len1][len2] = lcs(table, str, len1-1, len2-1) + 1;
        }
        else {
            table[len1][len2] = Math.max(lcs(table, str, len1, len2-1), lcs(table, str, len1-1, len2));
        }
        
        return table[len1][len2];
    }
}