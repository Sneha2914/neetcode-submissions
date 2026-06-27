class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        map<string, vector<string>> result;
        for(string s : strs){
            string value=s;
            sort(value.begin(),value.end());
            result[value].push_back(s);
        }
        vector<vector<string>> output;
        for(auto& val : result){
            output.push_back(val.second);
        }
        return output;
    }
};
