class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(0, nums, new ArrayList<>());
        return res;
    }

    void backtrack(int start, int[] nums, List<Integer> curr) {
        res.add(new ArrayList<>(curr));

        for (int i = start; i < nums.length; i++) {
            curr.add(nums[i]);
            backtrack(i + 1, nums, curr);
            curr.remove(curr.size() - 1);
        }
    }
}
