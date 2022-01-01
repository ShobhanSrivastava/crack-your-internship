import java.util.Arrays;

public class LC26_RemoveDuplicatesArray {
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int unique = 1, k = 1;
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i] != nums[i-1]){
                swap(nums, unique, i);
                unique++;
                k++;
            }
        }

        System.out.println(Arrays.toString(nums));

        return k;
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
