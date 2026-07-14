class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
int countZero=0;
int zeroIndex=0;
int n=nums.length;
         for(int i=0;i<n;i++){
            if(nums[i]!=0){
                prod*=nums[i];
            }else{
                countZero++;
                zeroIndex=i;
            }
        }
        
        int[] ans= new int[n];
        Arrays.fill(ans,0);
        if(countZero>1) return ans;
        if(countZero==1) ans[zeroIndex]=prod;
        else{
            for(int i=0;i<n;i++){
                ans[i]=prod/nums[i];
            }
        }

        return ans;
    }
}  
