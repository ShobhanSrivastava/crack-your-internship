public class LC344_ReverseStringRecursive {
    
    public void reverseString(char[] s) {
        reverse(s, 0);
    }
    
    public void swap(char[] s, int first, int second){
        char temp = s[first];
        s[first] = s[second];
        s[second] = temp;
    }
    
    public void reverse(char[] s, int index) {
        if(index == s.length/2){
            return;
        }
        
        swap(s, index, s.length-1-index);
        reverse(s, index+1);
    }
    
}
