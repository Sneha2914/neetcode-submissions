class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        map<int,int> count;
        for(int num:nums){
            count[num]++;
        }
        vector<pair<int,int>>result(count.begin(),count.end());
        sort(result.begin(), result.end(), [](const auto& a, const auto& b) {
        return a.second > b.second; // Ascending order by value
        });
        vector<int> output;
        for(int i=0;i<k;i++){
            output.push_back(result[i].first);
        }
        return output;
        
    }
};
