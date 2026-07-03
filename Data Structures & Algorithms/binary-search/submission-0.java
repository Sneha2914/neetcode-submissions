class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int m= nums.length -1;
        while(l<=m){
            int mid = (l+m)/2;
            if(nums[mid]>target){
                m= mid-1;
            }
            else if(nums[mid]==target)
                return mid;
            else{
                l=mid+1;
            }
        }
        return -1;
    }
}
