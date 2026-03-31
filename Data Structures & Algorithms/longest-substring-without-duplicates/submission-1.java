class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        HashSet<Character> hs= new HashSet<>();
        int max=0;
        for(int right=0;right<s.length();right++){
            
            while(hs.contains(s.charAt(right))){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(s.charAt(right));
            int windowLen=right-left+1;
            max=Math.max(max,windowLen);
        }
        return max;
    }
}
