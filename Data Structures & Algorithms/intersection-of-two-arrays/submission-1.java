class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> result = new HashSet<>();
        for(int num:nums1){
            for(int num2: nums2){
                if(num==num2){
                    result.add(num);
                }
            }
        }
        int n = result.size();
        int[] ans = new int[n];
        int i=0;
        for(int res : result){
            ans[i]= res;
            i++;
        }
        return ans;
    }
}