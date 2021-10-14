public class LC136_SingleNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,5,4,3,2,1};
        int single = singleNumber(arr);
        System.out.println(single);
    }
    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int n:nums){
            result^=n;
        }
        return result;
    }
}
