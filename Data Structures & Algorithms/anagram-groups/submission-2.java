class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String str : strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String rev= new String(ch);
            // if(hm.containsKey(rev)){
            //     hm.get(rev).add(str);
            // }else{
            //     List<String> list= new ArrayList<>();
            //     list.add(str);
            //     hm.put(rev,list);
            // }
            hm.putIfAbsent(rev,new ArrayList<>());
            hm.get(rev).add(str);
        }
        return new ArrayList<>(hm.values());
        
    }
}
