public class skipWordWhenRequired {
    public static void main(String[] args) {
        String str = "bccdaeappleto78app";
        String skip = "app";
        String notSkip = "apple";

        str = skipWord(str, notSkip, skip);
        System.out.println(str);
    }


    // notsSkip = "apple"
    // skip = "app"
    static String skipWord(String str, String notSkip, String skip){
        if(str.isEmpty()){
            return "";
        }

        if(!str.startsWith(notSkip) && str.startsWith(skip)){
            return skipWord(str.substring(skip.length()), notSkip, skip);
        }
        else{
            return str.charAt(0) + skipWord(str.substring(1), notSkip, skip);
        }
    }
}
