class Solution {
    public boolean checkInclusion(String s1, String s2) {
      int[] freq=new int[26];
      for(char c: s1.toCharArray()){
        freq[c-'a']++;
      }

      int i=0;
      int j=0;
      int n=s2.length();

      while(j<n){
        freq[s2.charAt(j)-'a']--;

        while(freq[s2.charAt(j)-'a']<0){
            freq[s2.charAt(i)-'a']++;
            i++;
        }


        if(j-i+1==s1.length()) return true;

        j++;
      }


      return false;
    }
}
