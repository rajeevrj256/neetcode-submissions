class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
     

        HashSet<Character>dup=new HashSet<>();
int maxLength=0;
        for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
            while(dup.contains(c)){
                dup.remove(s.charAt(i));
                i++;
            }
            maxLength=Math.max(maxLength,j-i+1);
            dup.add(c);
            

        }

        return maxLength;
    }
}
