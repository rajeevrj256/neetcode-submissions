class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int>hash;

        for(int i=0;i<nums.size();i++){
            int num=nums[i];
            int diff=target-num;
            if(hash.count(diff)!=0){
                return {hash[diff],i};
            }

            hash[num]=i;
        }

        return {-1,-1};
    }
};
