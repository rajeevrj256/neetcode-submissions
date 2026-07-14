class Solution {

    public String encode(List<String> strs) {
        String enCodeStr="";
        
        for(String str:strs){
           
            enCodeStr+=str;
            enCodeStr+=Integer.toString(-1);
        }


        return enCodeStr;
    }

    public List<String> decode(String str) {
          int index=0;
          List<String>st=new ArrayList<>();
          for(int i=0;i<str.length();i++){
            if (str.startsWith("-1", i)) {
                st.add(str.substring(index,i));
                index=i+2;
               
            }
          }

          return st;
    }
}
