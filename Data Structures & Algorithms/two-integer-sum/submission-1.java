class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>hash= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int remaining = target-nums[i];
            if(hash.containsKey(remaining)){
                return new int[]{hash.get(remaining),i};
            }

            hash.put(nums[i],i);
        }

        return new int[]{-1,-1};
    }
}
