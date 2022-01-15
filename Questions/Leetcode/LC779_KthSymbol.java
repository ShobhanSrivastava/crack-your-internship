public class LC779_KthSymbol {
    public static void main(String[] args) {
        System.out.println(getString(2, "0"));
        // System.out.println(kthGrammar(2, 1));
    }

    public static int kthGrammar(int n, int k) {
        String str = getString(n, "0");
        return (int)str.charAt(k-1) - 48;
    }
    
    public static String getString(int n, String curr){
        if(n == 0){
            return curr;
        }
        
        n -= 1;

        String newStr = "";

        for(int i=0 ; i<curr.length()-1 ; i++){
            if(curr.charAt(0) == '0'){
                newStr = new String(newStr.substring(0, i) + "01" + newStr.substring(i));
            }
            else{
                newStr = new String(newStr.substring(0, i) + "10" + newStr.substring(i));
            }
            System.out.println(newStr);
        }

        System.out.println(newStr);

        return getString(n, curr);
    }
}
