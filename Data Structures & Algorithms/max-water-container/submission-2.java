class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        
        int maxArea=Integer.MIN_VALUE;
       
            int l=0;
            int r=n-1;
            while(l<r){
            int area= (r-l)*(Math.min(heights[r],heights[l]));
            maxArea=Math.max(area,maxArea);
            if(heights[l]<=heights[r]){
l++;
            }
            else{
            r--;
            }

        }
        return maxArea;
    }
}
