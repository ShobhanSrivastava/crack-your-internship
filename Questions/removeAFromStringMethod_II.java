public class removeAFromStringMethod_II {
    public static void main(String[] args) {
        String str = "baccad";
        String newStr = removeA(str);
        System.out.println(newStr);
    }

    public static String removeA(String str) {
        
        if(str.isEmpty()){
            return "";
        }
        
        char ch = str.charAt(0);

        if(ch == 'a'){
            return removeA(str.substring(1));
        }
        else{
            return ch + removeA(str.substring(1));
        }
    }
}
