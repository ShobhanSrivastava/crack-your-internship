import java.util.ArrayList;

public class subsequenceOfStringArrayList {
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> list = subSequence(str, "");
        System.out.println(list);
    }

    static ArrayList<String> subSequence(String up, String p){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        ArrayList<String> left = subSequence(up.substring(1), p + up.charAt(0));
        ArrayList<String> right = subSequence(up.substring(1), p);

        left.addAll(right);
        return left;
    }
}
