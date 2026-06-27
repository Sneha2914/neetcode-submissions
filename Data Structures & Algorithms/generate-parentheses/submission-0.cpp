class Solution {
public:
    vector<string> generateParenthesis(int n) {
        vector<string>result;
        string stack;
        calcParenthesis(0,0,n,result,stack);
        return result;
    }
    void calcParenthesis(int openCount,int closedCount,int n,vector<string>& result,string& stack){
            if(openCount==closedCount && openCount==n){
                result.push_back(stack);
                return;
            }
            if(openCount<n)
            {
                stack+='(';
                calcParenthesis(openCount+1,closedCount,n,result,stack);
                stack.pop_back();
            }
            if(openCount>closedCount)
            {
                stack+=')';
                calcParenthesis(openCount,closedCount+1,n,result,stack);
                stack.pop_back();
            }

    }
};
