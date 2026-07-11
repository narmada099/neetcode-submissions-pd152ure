class Solution {
    List<List<Integer>> res= new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
       Arrays.sort(nums);
       boolean[] visited= new boolean[nums.length];
       backtrack(nums,visited,new ArrayList<>());
       return res;
    }

    void backtrack(int[] nums,boolean[] visited, List<Integer> curr){
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]&&!visited[i - 1]){
                continue;
            }
            if(visited[i]){
                continue;
            }

            curr.add(nums[i]);
            visited[i]=true;
            backtrack(nums,visited,curr);
            curr.remove(curr.size()-1);
            visited[i]=false;
        }
    }
}