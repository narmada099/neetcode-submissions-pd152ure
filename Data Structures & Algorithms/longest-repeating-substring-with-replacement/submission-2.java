class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int n = s.length();
        int maxFreq = 0;
        int res = 0;
        int[] freq = new int[26];
        for (int r = 0; r < n; r++) {
            char curr = s.charAt(r);
            freq[curr - 'A']++;
            maxFreq = Math.max(maxFreq, freq[curr - 'A']);

            while ((r - l + 1) - maxFreq > k) {
                freq[s.charAt(l)-'A']--;
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}