class Solution {
    public int specialArray(int[] nums) {
        int count =1;
        Arrays.sort(nums);
        for(int i = nums.length-1; i>=0;i--){
            if(nums[i]>=count){
                count++;
            }
            else if(nums[i]==count-1)
            {
                return -1;
            }
            else
            {  
                break;
            }
        }
        return count==1?-1:count-1;
    }
}