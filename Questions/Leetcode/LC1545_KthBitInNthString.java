public class LC1545_KthBitInNthString {
    public static void main(String[] args) {
        System.out.println(findNth(3)); 
    }

    static String findNth(int num){
        if(num == 1){
            return "0";
        }

        String newStr = findNth(num-1) + "1" + reverse(invert(findNth(num-1)));

        return newStr;
    }

    static String reverse(String str){
        String newStr = "";

        for(int i=str.length()-1 ; i>=0 ; i--){
            newStr = newStr + str.charAt(i);
        }

        return newStr;
    }

    static String invert(String str){
        String newStr = "";
        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i) == '0'){
                newStr+='1';
            }
            else{
                newStr+='0';
            }
        }
        return newStr;
    }
}
