class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max = 0, count = 0;
        for(int i = 1; i<nums.length ; i++){
            if(nums[i]<=nums[i-1]){
                if(count>max){
                    max = count;
                }
                count = 0;
            }else{
                count++;
            }
            
        }
        
        if(count>max){
            max = count;
        }
        
        return ++max;
    }
}
