class Solution {
    public int maxArea(int[] heights) {
      int n= heights.length;
      int left=0;
      int right=n-1;
      int max= Integer.MIN_VALUE;
      while(left<=right){
        max=Math.max((Math.min(heights[left],heights[right]))*(right-left),max);
        if(heights[left]<=heights[right]){
        left++;
        }else{
        right--;
        }
      }
    return max==Integer.MIN_VALUE?0:max;
    }
}
