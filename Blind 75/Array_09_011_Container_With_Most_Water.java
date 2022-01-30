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




//O(n) Accepted
class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int l = 0 , r = height.length-1;
        while(l<r){
            int area = ((height[l]<height[r])?height[l]:height[r]) * (r-l);
            if(area>maxArea){
                maxArea=area;
            }
            
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxArea;
    }
}
