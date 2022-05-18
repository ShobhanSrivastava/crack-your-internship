class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        
        int copy = x;
        int result = 0;
        
        while(copy != 0){
            int rem = copy%10;
            result = result * 10 + rem;
            copy/=10;
        }
        
        if(result == x){
            return true;
        }
        
        return false;
    }
}