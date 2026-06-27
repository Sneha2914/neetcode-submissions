class Solution {
public:
    int maxArea(vector<int>& heights) {
        int maxWater=INT_MIN;
        int i=0;
        int j=heights.size()-1;
        while(i<j){
                int k=min(heights[i],heights[j]);
                int capacity=(j-i)*k;
                maxWater=max(maxWater,capacity);
                if(heights[i]<heights[j])
                    i++;
                else
                    j--;
            }
        return maxWater;
    }
};
