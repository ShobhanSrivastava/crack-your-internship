import java.util.ArrayList;

public class LC17_PhoneNumberCombination {
    public static void main(String[] args) {
        String[] numberArr = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        System.out.println(phoneNumberCombinations("", "696", numberArr));
    }

    static ArrayList<String> phoneNumberCombinations(String p, String digits, String[] numberArr){
        if(digits.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = (int)digits.charAt(0);
        System.out.println(digit);
        ArrayList<String> list = new ArrayList<>();

        String digitMap = numberArr[digit - 50];
        for(int i=0 ; i < digitMap.length() ; i++){
            list.addAll(phoneNumberCombinations(p + digitMap.charAt(i), digits.substring(1), numberArr));
        }
        return list;
    }
}
