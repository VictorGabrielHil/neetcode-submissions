class Solution {
    public boolean hasDuplicate(int[] nums) {
        

      Set<Integer> countNumbers = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {

            if (countNumbers.contains(nums[i])) {
                return true;
            }
            countNumbers.add(nums[i]);
        }
        return false;
    }

}