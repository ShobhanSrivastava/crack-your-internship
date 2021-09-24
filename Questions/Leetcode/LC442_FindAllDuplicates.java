// https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.*;

public class LC442_FindAllDuplicates {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        cycleSort(nums);
        
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] != i+1){
                ans.add(nums[i]);
            }
        }

        System.out.println(ans);
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
