//Brute force Time limit exceeded
class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
       for(int i=0 ; i <height.length ; i++){
          for(int j=i+1 ; j <height.length ; j++){
            int area = ((height[i]>height[j])?height[j]:height[i]) * (j-i);
           if(area>maxArea){
               maxArea = area;
           }
        }  
       }
        return maxArea;
    }
}
