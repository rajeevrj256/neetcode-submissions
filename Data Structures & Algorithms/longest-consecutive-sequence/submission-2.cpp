class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int>hash(nums.begin(),nums.end());


        int maxLen=0;
        for(int num:hash){
            if(hash.find(num-1)==hash.end()){
               int length=1;
               int curr=num;

               while(hash.find(curr+1)!=hash.end()){
                length++;
                curr++;
               }

               maxLen=max(maxLen,length);

            }
        }

        return maxLen;
    }
};
