class Solution {
    public int findMin(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int mini=nums[0];
        while(i<=j){
            if(nums[i]<=nums[j]){
                mini=Math.min(mini,nums[i]);
                break;
            }
             int mid = i + (j - i) / 2;

       
            if(nums[mid]>=nums[i]) {
                mini=Math.min(mini,nums[i]);
                i=mid+1;
                      
            }
            else {
                mini=Math.min(mini,nums[mid]);
                j=mid-1;
            }
        }

        return mini;
    }
}
