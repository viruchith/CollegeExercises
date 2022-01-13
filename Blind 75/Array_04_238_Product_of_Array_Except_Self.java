class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixes = new int[nums.length];
        
        int prefixProduct = 1;
        
        for(int i = 0 ; i<nums.length ; i++){
            prefixes[i] = prefixProduct;
            prefixProduct *= nums[i];
        }
        
        int postfixProduct = 1;
    
        for(int i = nums.length-1 ; i>=0 ; i--){
            prefixes[i] *= postfixProduct;
            postfixProduct *= nums[i];
        }
        
        return prefixes;
    }
}
