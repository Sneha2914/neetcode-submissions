class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        stack<int>stk;
        int ans=0;
        for(auto &token : tokens){
            if(token== "+" )
            {
                int a =stk.top();
                stk.pop();
                int b=stk.top();
                stk.pop();
                stk.push(a + b);
            }
            else if(token =="-")
            {
                int a =stk.top();
                stk.pop();
                int b=stk.top();
                stk.pop();
                stk.push(b - a);
            }
            else if(token=="*")
            {
                int a =stk.top();
                stk.pop();
                int b=stk.top();
                stk.pop();
                stk.push(a * b);
            }
            else if(token == "/")
            {
                int a =stk.top();
                stk.pop();
                int b=stk.top();
                stk.pop();
                stk.push(b / a);
            }
            else{
                stk.push(stoi(token));
            }
            
        }
        ans=stk.top();
      return ans;  
    }
};
