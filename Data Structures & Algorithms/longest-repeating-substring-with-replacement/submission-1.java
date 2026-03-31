class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int n =s.length();
        int[] freq= new int[26];
        int maxFreq=0;
        int res=0;
        for(int right=0;right<n;right++){
           char c=s.charAt(right);
           freq[c-'A']++;
           maxFreq=Math.max(maxFreq,freq[c-'A']);

             while((right-left+1)-maxFreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
             }
           res=Math.max(res,right-left+1);
        }
        return res;
    }
}
