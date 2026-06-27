class Solution {
public:
    int findDuplicate(vector<int>& nums) {
       map<int,int>duplicate;
       for(int num: nums){
         duplicate[num]++;
       }
       for(auto& duplic: duplicate){
        if(duplic.second>1)
            return duplic.first;
       }
    }
};
