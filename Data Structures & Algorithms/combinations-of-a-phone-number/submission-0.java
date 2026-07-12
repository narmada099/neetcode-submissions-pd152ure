class Solution {
    List<String> res= new ArrayList<>();
    Map<Character, String> map= Map.of(
        '2',"abc",
        '3',"def",
        '4',"ghi",
        '5',"jkl",
        '6',"mno",
        '7',"pqrs",
        '8',"tuv",
        '9',"wxyz"
    );
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return res;
        }
        backtrack(digits,0,new StringBuilder());
        return res;
    }


    void backtrack(String digits,int index,StringBuilder curr){
        if(index==digits.length()){
            res.add(curr.toString());
            return;
        }
        String letters=map.get(digits.charAt(index));
       for(int i=0;i<letters.length();i++){
        curr.append(letters.charAt(i));
        backtrack(digits,index+1,curr);
        curr.deleteCharAt(curr.length()-1);
       }
    }
}
