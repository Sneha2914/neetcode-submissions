class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_set<int> isPresent;
        for(int k: nums){
            if(isPresent.count(k))
                return true;
            isPresent.insert(k);
        }
        return false;
    }
};
