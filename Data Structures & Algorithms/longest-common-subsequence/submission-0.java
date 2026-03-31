class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        HashMap<String,Integer> hm= new HashMap<>();
        return dfs(0,0,text1,text2,hm);
    }
    int dfs(int i,int j,String text1,String text2,HashMap<String,Integer> hm){
        if(i==text1.length()||j==text2.length()){
            return 0;
        }
        String key= i+","+j;
        if(hm.containsKey(key)){
            return hm.get(key);
        }
        int ans;
        if(text1.charAt(i)==text2.charAt(j)){
            ans=1+dfs(i+1,j+1,text1,text2,hm);
        }else{
            ans= Math.max(dfs(i+1,j,text1,text2,hm),dfs(i,j+1,text1,text2,hm));
        }
        hm.put(key,ans);
        return ans;
    }
}
