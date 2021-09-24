// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.*;

class LC448_FindAllNumbersDisappeared {

    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<Integer>();
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        cyclicSort(arr);
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]!=i+1)
                ans.add(i+1);
        }

        System.out.println(ans);
    }

    static void cyclicSort(int[] arr){
        int i=0;
        while (i<arr.length) {
            if(arr[i] != i+1 && arr[i] != arr[arr[i]-1]){
                swap(arr, i, arr[i]-1);
            }
            else{
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