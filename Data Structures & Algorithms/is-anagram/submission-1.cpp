class Solution {
public:
    bool isAnagram(string s, string t) {
        map<char,int>sMap;
        map<char,int>tMap;
        for(char i:s){
            sMap[i]++;
        }
        for(char i:t){
            tMap[i]++;
        }
        if(sMap==tMap)
            return true;
        else
            return false;
    }
};
