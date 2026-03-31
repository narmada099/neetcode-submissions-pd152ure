class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length()){
        return false;
    }
    // HashMap<Character,Integer> hm= new HashMap<>();
    // for(char c: s.toCharArray()){
    //     hm.put(c,hm.getOrDefault(c,0)+1);
    // }
    // for(char c:t.toCharArray()){
    //     if(!hm.containsKey(c)){
    //         return false;
    //     }
    //     hm.put(c,hm.get(c)-1);
    // }
    // for(int i:hm.values()){
    //     if(i!=0){
    //         return false;
    //     }
    // }
    // return true;
    int[] freq= new int[26];
    for(int i=0;i<s.length();i++){
       freq[s.charAt(i)-'a']++;
       freq[t.charAt(i)-'a']--;
    }
    
    for(int val: freq){
        if(val!=0){
            return false;
        }
    }
    return true;
    }
}
