class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>hash=new HashSet<>();

        for(int num:nums){
            hash.add(num);
        }


        Integer maxLen=0;

        for(int num:hash){
            if(!hash.contains(num-1)){
                int curr=num;
                int len=1;

                while(hash.contains(curr+1)){
                    len++;
                    curr++;
                }

                maxLen=Math.max(maxLen,len);
            }
        }

        return maxLen;
    }
}
