class Solution {
public:
    int maxArea(vector<int>& heights) {
        int maxWater=INT_MIN;
        for(int i=0;i<heights.size();i++){
            for(int j=i+1;j<heights.size();j++){
                int k=min(heights[i],heights[j]);
                int capacity=(j-i)*k;
                maxWater=max(maxWater,capacity);
            }
        }
        return maxWater;
    }
};
