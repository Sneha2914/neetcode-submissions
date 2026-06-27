class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int,int> lookup;
        for(int i=0; i<nums.size();i++){
            int k=target-nums[i];
            auto it=lookup.find(k);
            if(lookup.find(k)!=lookup.end())
                return {it->second,i};
            else
                lookup.insert({nums[i],i});
        }
    }
};
