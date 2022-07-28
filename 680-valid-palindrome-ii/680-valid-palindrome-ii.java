class Solution {
    public boolean validPalindrome(String s) {
        return endMovesLeft(s) || startMovesRight(s);
    }
    
    public boolean endMovesLeft(String str){
        int moved = 0;
        int start = 0, end = str.length()-1;
        while(start <= end){
            char chStart = str.charAt(start);
            char chEnd = str.charAt(end);
            
            if(chStart == chEnd){
                start++;
                end--;
            }
            else{
                if(moved == 1){
                    return false;
                }
                else{
                    moved = 1;
                    end--;
                }
            }
        }
        
        return true;
    }
    
    public boolean startMovesRight(String str){
        int moved = 0;
        int start = 0, end = str.length()-1;
        while(start <= end){
            char chStart = str.charAt(start);
            char chEnd = str.charAt(end);
            
            if(chStart == chEnd){
                start++;
                end--;
            }
            else{
                if(moved == 1){
                    return false;
                }
                else{
                    moved = 1;
                    start++;
                }
            }
        }
        
        return true;
    }
    
    
}