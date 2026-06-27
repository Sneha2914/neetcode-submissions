class Solution {
public:
    bool isPalindrome(string s) {
        string rev;
        for(char c: s){
            if(isalnum(c))
                rev+=tolower(c);
        }
        return rev== string(rev.rbegin(),rev.rend());
    }
};
