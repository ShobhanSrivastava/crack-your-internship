/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while(start <= end){
            int mid = start + (end-start)/2;
            
            boolean isBad = isBadVersion(mid);
            boolean prevIsBad = isBadVersion(mid-1);
            
            if(isBad){
                if(!prevIsBad){
                    return mid;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                start = mid+1;
            }
        }
        
        return -1;
    }
}