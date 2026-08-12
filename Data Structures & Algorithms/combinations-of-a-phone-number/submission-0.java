class Solution {

    String[] map={
        "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };


    public void backtracking(String s,String temp,List<String>ans,int index){
        if(index==s.length()){
            ans.add(temp);
            return;
        }


        String letter= map[s.charAt(index)-'0'];


        for(char c:letter.toCharArray()){
            temp+=c;

            backtracking(s,temp,ans,index+1);


            temp=temp.substring(0,temp.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String>ans= new ArrayList<>();
        if(digits.length()==0){
           return ans;
        }
        String temp="";
        
        backtracking(digits,temp,ans,0);

        return ans;

    }
}
