import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        int longest = 0;
        char arr[] = s.toCharArray();
        for(int i = 0 ; i<arr.length ; i++){
           Set<Character> temp = new HashSet<>();
           for(int j = i ; j <arr.length ; j++){
               if(!temp.contains(arr[j])){
                   temp.add(arr[j]);
               }else{
                   break;
               }
           }
            longest = (temp.size()>longest)?temp.size():longest;
        }
        return longest;
    }
}
