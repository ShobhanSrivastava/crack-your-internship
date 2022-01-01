public class skipWord {
    public static void main(String[] args) {
        String skip = "apple";
        String str = "baccdapple78ouiuo";
        str = skipString(str, skip);
        System.out.println(str);
    }

    static String skipString(String str, String skip){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith(skip)){
            return skipString(str.substring(skip.length()), skip);
        }
        else{
            return str.charAt(0) + skipString(str.substring(1), skip);
        }
    }
}
