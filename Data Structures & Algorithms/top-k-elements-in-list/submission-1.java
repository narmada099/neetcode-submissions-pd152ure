class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<int[]> list= new ArrayList<>();
         HashMap<Integer,Integer> hm= new HashMap<>();
         for(int n :nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
         }
         for(Map.Entry<Integer,Integer> entry :hm.entrySet()){
           
                list.add(new int[]{entry.getValue(),entry.getKey()});
            
         }
         list.sort((a,b)->b[0]-a[0]);
         int[] res= new int[k];
         for(int i=0;i<k;i++){
            res[i]=list.get(i)[1];
         }
         return res;
    }
}
