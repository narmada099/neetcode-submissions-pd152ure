class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        Arrays.sort(strs,(a ,b)-> a.length()-b.length());
        String pref=strs[0];
         for(int i=1;i<strs.length;i++){
            String curr= strs[i];   
                while(!curr.startsWith(pref)){
                   pref= pref.substring(0,pref.length()-1); 
                   if(pref.isEmpty()){
                        return pref;
                    }
                }            
                }
      return pref;
    }
}

//dag dance damage , -- dag , dance damage , dance 