class Solution {

    public boolean palindrome(String str){
        int i=0;
        int j=str.length()-1;

        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)) return false;

            i++;
            j--;
        }


        return true;
    }
    public void backtracking(String s,List<String>st,List<List<String>>ans){
        if(s.length()==0) {
            ans.add(new ArrayList<>(st));
            return;
        }


        for(int i=0;i<s.length();i++){
            String part=s.substring(0,i+1);
            if(palindrome(part)){
            st.add(part);
            backtracking(s.substring(i+1),st,ans);
            st.remove(st.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>>ans=new ArrayList<>();
        List<String>st=new ArrayList<>();

        backtracking(s,st,ans);

        return ans;
    }
}
