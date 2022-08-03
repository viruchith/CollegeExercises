//Brute Force


class Solution {
    public String longestPalindrome(String s) {
        int  l = 0 , r = 0;
        String longest = "";
        for(int i = 0 ; i<s.length() ; i++){
            for(int j = i ; j<=s.length() ; j++){
                String substr = s.substring(i,j);
                if(substr.equals(new StringBuilder(substr).reverse().toString())){
                    longest = (substr.length()>=longest.length())?substr:longest;
                }
            }
        }
        
        return longest;
    }
}


//  Optimal expand from middle

class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
        for(int i = 0 ; i<s.length() ; i++){
            int  l = i , r = i;
          // ODD length palindrome
            while(l>=0 && r< s.length() && s.charAt(l)==s.charAt(r)){
                if((r-l)+1 > longest.length() ){
                    longest = s.substring(l,r+1);
                }
                l--;
                r++;
            }
            
            l = i ; r= i+1;
            // EVEN length palindrome
            while(l>=0 && r< s.length() && s.charAt(l)==s.charAt(r)){
                if((r-l)+1 > longest.length() ){
                    longest = s.substring(l,r+1);
                }
                l--;
                r++;
            }
        }
        
        return longest;
    }
}
