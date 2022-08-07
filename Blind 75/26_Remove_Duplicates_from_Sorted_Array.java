class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        int[] temp = new int[nums.length];
        
        int k = 0;
        
        for(int num : nums){
            if(!set.contains(num)){
                temp[k++] = num;
            }  
            set.add(num);
        }
        
        for(int j = 0 ; j<nums.length ; j++){
            nums[j] = temp[j];
        }
        
        return k;
    }
}

//----------------------------------------------------------------------------------------------------------------

//Optimal Inplace

class Solution {
    public int removeDuplicates(int[] nums) {        
        int k = 0;
        
        for(int i = 1 ; i<nums.length ; i++){
            if(nums[k] != nums[i]){
                nums[++k] = nums[i];
            }
        }
        
     
        return k+1;
    }
}
