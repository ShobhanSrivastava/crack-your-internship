public class removeAFromStringUsingRecursion {
    public static void main(String[] args){
        String str = "shobhan";
        removeA(str, "");
    }

    static void removeA(String str, String ans){
        
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        
        if(str.charAt(0) != 'a'){
            removeA(str.substring(1), ans+str.charAt(0));
        }
        else{
            removeA(str.substring(1), ans);
        }
    }
}
