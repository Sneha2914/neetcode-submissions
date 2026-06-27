class Solution {
public:
    bool isValid(string s) {
        stack<char> stack;
        map<char,char> paranthesis = {{')','('},{']','['},{'}','{'}};
        for(char c: s){
            if(!stack.empty() && stack.top()==paranthesis[c])
                stack.pop();
            else    
                stack.push(c);
        }
        return stack.empty();
    }
};
