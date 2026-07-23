class Solution {
    public int characterReplacement(String s, int k) {
        int i=0;
        int j=0;
        HashMap<Character, Integer> hash = new HashMap<>();

        int n=s.length();
        int maxFreq=0;
        int maxLen=0;
        while(j<n){
            hash.put(s.charAt(j),hash.getOrDefault(s.charAt(j),0)+1);
            maxFreq=Math.max(maxFreq,hash.get(s.charAt(j)));
            int diff=(j-i+1)-maxFreq;

            while(diff>k){
                hash.put(s.charAt(i),hash.get(s.charAt(i))-1);
                i++;
                diff=(j-i+1)-maxFreq;
            }

            maxLen=Math.max(maxLen,j-i+1);
            j++;
        }

        return maxLen;
    }
}
