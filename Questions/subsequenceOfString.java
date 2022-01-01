public class subsequenceOfString {
    public static void main(String[] args) {
        String str = "abc";
        subSequence(str, "");
    }

    static void subSequence(String up, String p){
        if(up.isEmpty()){
            System.out.print(" "+p+" ");
            return;
        }

        subSequence(up.substring(1), p);
        subSequence(up.substring(1), p+up.charAt(0));
    } 
}
