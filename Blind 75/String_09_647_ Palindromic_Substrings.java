class Solution {
    public int countSubstrings(String s) {
      int count = 0;
      for(int i = 0 ; i<s.length() ; i++){
          for(int j = i ; j<s.length() ; j++){
              String substr = s.substring(i,j+1);
              if(substr.equals(new StringBuilder(substr).reverse().toString())){
                  count++;
              }
          }
      }
        return count;
    }
}
