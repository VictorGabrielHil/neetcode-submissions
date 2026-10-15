class Solution {
    public boolean hasDuplicate(int[] nums) {
        int i=0,j,flag=0;
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}