// https://leetcode.com/problems/find-the-duplicate-number/

class LC287_FindDuplicate{
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        cycleSort(arr);
        System.out.println(arr[arr.length-1]);
    }

    static void cycleSort(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1 && arr[i]!=arr[arr[i]-1]){
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