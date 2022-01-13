class Solution {
    public int maxProduct(int[] nums) {
        int totalProduct = (nums.length>1)?Integer.MIN_VALUE:nums[0];
        for(int i = 0; i<nums.length ; i++){
            int currentProduct = nums[i];
            for(int j=i+1 ; j<nums.length ; j++){
                if(currentProduct>totalProduct){
                    totalProduct = currentProduct;
                }
                    currentProduct*=nums[j];
            }
            
            if(currentProduct>totalProduct){
                    totalProduct = currentProduct;
                }
        }
        return totalProduct;
    }
}
