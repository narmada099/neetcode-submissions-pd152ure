class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        backtrack(0, nums, target, new ArrayList<>());
        return res;
    }

    void backtrack(int start, int[] nums, int remaining, List<Integer> curr) {
        if (remaining == 0) {
            res.add(new ArrayList<>(curr));
        }
        if (remaining < 0) {
            return;
        }
        for (int i = start; i < nums.length; i++) {
            curr.add(nums[i]);
            backtrack(i, nums, remaining - nums[i], curr);
            curr.remove(curr.size() - 1);
        }
    }
}
