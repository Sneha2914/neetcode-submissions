class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        vector<vector<int>> result;
        for(int i=0;i<nums.size()-2;i++){
            if(i>0 && nums[i-1]==nums[i])
                continue;
            int start=i+1;
            int end=nums.size()-1;
            while(start<end){
                int sum=nums[i]+nums[start]+nums[end];
                if(sum<0)
                    start++;
                else if(sum>0)
                    end--;
                else{
                    result.push_back({nums[i],nums[start],nums[end]});
                    start++;
                    end--;
                    while(start<end && nums[start]==nums[start-1])
                        start++;
                }

            }
        }
        return result;
    }
};
