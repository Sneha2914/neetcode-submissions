class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
       for(int i=0;i<nums.size();i++){
            int k=nums[i];
            int count=1;
        for(int j=i+1;j<nums.size();j++){
            if(k==nums[j])
                count++;
            if(count>=2)
                return true;
        }

       }
       return false;
    }
};
