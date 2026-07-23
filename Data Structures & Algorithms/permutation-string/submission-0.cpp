class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        vector<int>feqA(26,0);
        for(char c:s1){
            feqA[c-'a']++;
        }

        vector<int>feqB(26,0);

        int i=0;
        int j=0;
        int n=s2.size();

        while(j<n){
            feqA[s2[j]-'a']--;
            while(feqA[s2[j]-'a']<0){
                feqA[s2[i]-'a']++;
                i++;
            }
            if(j-i+1==s1.size()) return true;
            j++;
        }


        return false;
    }
};
