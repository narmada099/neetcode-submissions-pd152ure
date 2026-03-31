class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        // Arrays.sort(nums);
        // int max=1;
        // int curr=1;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]==nums[i-1]){
        //         continue;
        //     }
        //     if(nums[i]==nums[i-1]+1){
                
        //         curr++;
        //         max=Math.max(max,curr);
               
        //     }else{
        //     curr=1;
        //     }
        // }
        // return max;

        HashSet<Integer> hs= new HashSet<>();
        for(int n:nums){
            hs.add(n);
        }

        int max=0;
       
        for(int n :hs){
            if(!hs.contains(n-1)){
                int current=1;
                while(hs.contains(n+current)){
                    current++;
                }
                   max=Math.max(max,current);
            }
         
        }
        return max;
    }
}
