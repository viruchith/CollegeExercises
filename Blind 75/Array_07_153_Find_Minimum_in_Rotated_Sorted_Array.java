class Solution {
    public int findMin(int[] nums) {
        int prev = nums[0],current = nums[0];
        for(int i = nums.length-1 ; i>=0 ; i--){
            current = nums[i];
            if(current>prev){
                return prev;
            }
            prev = current;
        }
        return current;
    }
}
