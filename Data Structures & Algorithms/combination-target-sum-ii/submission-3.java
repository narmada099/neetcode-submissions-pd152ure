class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates, 0, target, new ArrayList<>());
        return res;
    }

    void backtrack(int[] candidates, int start, int remaining, List<Integer> curr) {
        if (remaining == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        if (remaining < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (candidates[i] > remaining) {
                break;
            }
             curr.add(candidates[i]); 
            backtrack(candidates, i + 1, remaining - candidates[i], curr);
            curr.remove(curr.size() - 1);
        }
    }
}
