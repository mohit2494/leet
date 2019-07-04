class Solution {
public:
    int maxArea(vector<int>& height) {
        int maxarea = 0, l = 0, r = height.size()-1;
        while(l<r) {
           maxarea = std::max(maxarea,std::min(height[l],height[r])*(r-l));
            if (height[l]<height[r]){
                ++l;
            }
            else {
                --r;
            }
        }
    return maxarea;
    }
};
