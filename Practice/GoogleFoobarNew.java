import java.util.ArrayList;

public class GoogleFoobarNew{
    public static void main(String[] args) {
        System.out.println(solution("210022", 3));
        System.out.println(solution("1211", 10));
    }

    public static int solution(String nums, int base) {
        ArrayList<String> cycle = new ArrayList<>();
        while(true){
            String diff = differenceWithBase(nums, base);
            // System.out.println(diff);
            if(cycle.contains(diff)){
                // System.out.println(cycle);
                return (cycle.size() - cycle.indexOf(diff));
            }
            else if(Integer.parseInt(diff) == 0){
                return 0;
            }
            else{
                cycle.add(diff);
                nums = new String(diff);
            }
        }
    }

    public static String differenceWithBase(String nums, int base){
        nums = new String(sort(nums, base));
        String diff = "";
        int carry = 0;
        int len = nums.length();
        for(int i=len-1 ; i>=0 ; i--){
            int d1 = nums.charAt(i)-48;
            int d2 = nums.charAt(len-1-i)-48;

            int d = d1 - d2 - carry;

            if(d < 0){
                carry = 1;
                d += base;
            }
            else{
                carry = 0;
            }

            diff = d + diff;
        }
        return diff;
    }

    public static String sort(String nums, int base){
        int[] num = new int[base];
        for(int i=0 ; i<nums.length() ; i++){
            int digit = nums.charAt(i)-48;
            num[digit]++;
        }

        String sorted = "";
        for(int i=base-1 ; i>=0 ; i--){
            for(int j=1 ; j<=num[i] ; j++){
                sorted = sorted + i;
            }
        }

        // System.out.println("Sorted of "+nums+" : "+sorted);
        return sorted;
    }

}