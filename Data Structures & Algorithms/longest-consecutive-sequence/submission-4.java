class Solution {
    public int longestConsecutive(int[] nums) {
       Arrays.sort(nums);
       int len = 1 ;
       int maxLen = 0;
       if(nums.length==0)
       return 0;
       int prev = nums[0];
       for(int i=1;i<nums.length;i++){
         if(nums[i]==prev+1){
            len++;
         }
         else if(prev==nums[i]){
            continue;
         }
         else{
           maxLen = Math.max(maxLen,len);
           len=1;
         }
            prev = nums[i]; 
       }
       maxLen = Math.max(maxLen,len);
       return maxLen; 
    }
}
