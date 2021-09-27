// https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

public class Lc645_SetMismatch {

    public static void main(String[] args) {
        int[] nums = { 2, 2};
        int[] ans = new int[2];
        cycleSort(nums);
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] != i+1){
                ans[0] = nums[i];
                ans[1] = i+1;
            }
        }
        System.out.println(Arrays.toString(ans));
    }

    static void cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1 && arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
