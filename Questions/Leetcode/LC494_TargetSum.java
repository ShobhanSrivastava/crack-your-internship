public class LC494_TargetSum {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int target = 3;

        System.out.println(countWays(nums, target, 0, 0));
    }

    static int countWays(int[] nums, int target, int index, int sum){
        if(index == nums.length){
            if(sum == target)
                return 1;
            else
                return 0;
        }

        int count = 0;

        count += countWays(nums, target, index+1, sum + nums[index]);
        
        count += countWays(nums, target, index+1, sum - nums[index]);
        

        return count;
    }

}
