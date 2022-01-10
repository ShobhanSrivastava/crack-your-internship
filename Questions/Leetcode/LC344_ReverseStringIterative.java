public class LC344_ReverseStringIterative {
    public void reverseString(char[] s) {
        for(int i=0 ; i<s.length/2 ; i++){
            swap(s, i, s.length-1-i);
        }
    }
    
    public void swap(char[] s, int first, int second){
        char temp = s[first];
        s[first] = s[second];
        s[second] = temp;
    }
}
