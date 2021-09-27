public class LC1528_ShuffleTheString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        String newStr = restoreString(s, indices);
        System.out.println(newStr);
    }

    public static String restoreString(String s, int[] indices) {
        char[] charArr = new char[indices.length];

        for(int i=0 ; i<indices.length ; i++){
            charArr[indices[i]] = s.charAt(i); 
        }

        return String.valueOf(charArr); //String.valueof(obj) gives the string value of the given object.
    }
}
