class Solution {
    public int maxSubArray(int[] nums) {
        int total = Integer.MIN_VALUE , current_total = 0;
        for(int num : nums){
            current_total+=num;
           if(total<current_total){
               total = current_total;
           }
            
            if(current_total<0){
                current_total = 0;
            }
       }
        return total;
    }
}
