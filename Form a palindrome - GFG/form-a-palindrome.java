//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            
            String S = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.findMinInsertions(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int findMinInsertions(String s){
        String reverseS = reverse(s);
        int len = s.length();

        Integer[][] table = new Integer[len+1][len+1];
        for(int i=0 ; i<=len ; i++) {
            table[0][i] = 0;
        }

        for(int i=0 ; i<=len ; i++) {
            table[i][0] = 0;
        }

        int result = lcs(table, s, reverseS, len, len);

        return len - result;
    }

    private String reverse(String str) {
        String res = "";
        for(int i=0 ; i<str.length() ; i++) {
            res = str.charAt(i) + res;
        }

        return res;
    }

    private int lcs(Integer[][] table, String str1, String str2, int len1, int len2) {
        if(len1 == 0 || len2 == 0) return 0;

        if(table[len1][len2] != null) return table[len1][len2];

        if(str1.charAt(len1-1) != str2.charAt(len2-1)) {
            int reducingStr1 = lcs(table, str1, str2, len1-1, len2);
            int reducingStr2 = lcs(table, str1, str2, len1, len2-1);

            return table[len1][len2] = Math.max(reducingStr1, reducingStr2);
        }
        else {
            return table[len1][len2] = lcs(table, str1, str2, len1-1, len2-1) + 1;
        }
    }
}