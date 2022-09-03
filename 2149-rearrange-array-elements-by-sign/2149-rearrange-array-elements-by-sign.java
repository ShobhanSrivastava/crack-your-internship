class Solution {
    public int[] rearrangeArray(int[] arr) {
        int[] res = new int[arr.length];
        int pos = 0, neg = 1;
        
        for(int num : arr){
            if(num >= 0){
                res[pos] = num;
                pos+=2;
            }
            else{
                res[neg] = num;
                neg+=2;
            }
        }
        
        return res;
    }
    
    // public void swap(int[] arr, int a, int b){
    //     int temp = arr[a];
    //     arr[a] = arr[b];
    //     arr[b] = temp;
    // }
}