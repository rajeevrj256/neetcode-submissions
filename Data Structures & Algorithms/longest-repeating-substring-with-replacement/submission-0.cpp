class Solution {
public:
    int characterReplacement(string s, int k) {
        int i=0;
        int j=0;
        unordered_map<char,int>hash;

        int n=s.size();
        int maxLen=0;
        int maxFreq=0;
        while(j<n){
            hash[s[j]]++;
            maxFreq=max(maxFreq,hash[s[j]]);
            int diff=(j-i+1)-maxFreq;
            while(diff>k){
               hash[s[i]]--;
               i++;
               diff--;
            }
            maxLen=max(maxLen,j-i+1);
            j++;

        }

        return maxLen;
    }
};
