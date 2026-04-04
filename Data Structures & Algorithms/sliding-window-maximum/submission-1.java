class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n =nums.length;
        int[] res= new int[n-k+1];
        Deque<Integer> q= new ArrayDeque<>();
        int l=0;
        for(int r=0;r<n;r++){
            if(!q.isEmpty()&& q.peekFirst()<r-k+1){
                q.pollFirst();
            }
          while(!q.isEmpty() && nums[q.peekLast()]<nums[r]){
               q.pollLast();
          }
          q.offerLast(r);
          if(r>=k-1){
            res[l++]=nums[q.peekFirst()];
          }
        }
      return res;
    
    }
}
