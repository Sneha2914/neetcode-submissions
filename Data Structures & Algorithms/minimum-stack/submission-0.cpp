class MinStack {
public:
    stack<int> stk;
    MinStack() {
        
    }
    
    void push(int val) {
        stk.push(val);
        
    }
    
    void pop() {
        stk.pop();
    }
    
    int top() {
        return stk.top();
    }
    
    int getMin() {
        int minVal=INT_MAX;
        stack<int> temp;
        while(!stk.empty()){
            int top = stk.top();
            stk.pop();
            temp.push(top);
            minVal=min(minVal,top);
        } 
        while(!temp.empty()){
            stk.push(temp.top());
            temp.pop();
        }
        return minVal;
    }
};
