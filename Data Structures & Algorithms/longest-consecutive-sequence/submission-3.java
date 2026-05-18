class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int n : nums) {
            hs.add(n);
        }

        int max = 0;

        for (int n : hs) {
            if (!hs.contains(n - 1)) {
                int current = 1;
                while (hs.contains(n + current)) {
                    current++;
                }
                max = Math.max(current, max);
            }
        }
        return max;
    }
}
