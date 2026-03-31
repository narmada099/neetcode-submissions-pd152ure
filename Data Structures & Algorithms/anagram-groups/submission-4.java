class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res= new ArrayList<>();
        HashMap<String,List<String>> hm= new HashMap<>();
        for(String s:strs){
            char[] ch= s.toCharArray();
            Arrays.sort(ch);
            String curr=String.valueOf(ch);
            // if(hm.containsKey(curr)){
            //     hm.get(curr).add(s);
            // }else{
            //     hm.put(curr, new ArrayList<>(List.of(s)));
            // }
            hm.putIfAbsent(curr,new ArrayList<>());
            hm.get(curr).add(s);
        }
        for(List<String> list:hm.values()){
            res.add(list);
        }
        return res;
    }
}