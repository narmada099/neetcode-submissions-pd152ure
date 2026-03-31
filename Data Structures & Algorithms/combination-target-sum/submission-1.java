class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        HashMap<String,List<List<Integer>>> hm= new HashMap<>();
        return combinationSumHelper(nums,target,0,hm);
    }
    List<List<Integer>> combinationSumHelper(int[] nums, int target,int index,HashMap<String,List<List<Integer>>> hm ){
        if(target==0){
            List<List<Integer>> baseCase= new ArrayList<>();
            baseCase.add(new ArrayList<>());
            return baseCase;
        }

        String key= target+","+index;

        if(hm.containsKey(key)){
            return hm.get(key);
        }
        List<List<Integer>> res= new ArrayList<>();
        for(int i=index;i<nums.length;i++){
            int rem= target-nums[i];
            if(rem>=0){
            List<List<Integer>> curr= combinationSumHelper(nums,rem,i,hm);
            for(List<Integer> li : curr){
                List<Integer> list= new ArrayList<>(li);
                list.add(nums[i]);
                res.add(list);
            }
            }
        }
        hm.put(key,res);
        return res;
    }
}
