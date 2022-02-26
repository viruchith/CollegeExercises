class Solution {
    
    public char getOpenBracketForClosingBracket(char c){
        switch(c){
            case ')':
            return '(';
            case '}':
            return '{';
            default:
            return '[';
        }
    }
    
    public boolean isValid(String s) {
        
        if(s.length()==0 || s.length() == 1){
            return false;
        }
        
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }else if(!stack.isEmpty()){
                char prev = stack.pop();
                if(prev != getOpenBracketForClosingBracket(c)){
                    return false;
                }
            }else{
                return false;
            }
        }
        
        return (stack.isEmpty())?true:false;
    }
}
