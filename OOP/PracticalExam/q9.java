import java.util.*;

// Infix evaluation program copied from GeeksForGeeks
class EvaluateString
{
    public static int evaluate(String expression)
    {
        char[] tokens = expression.toCharArray();
 
         // Stack for numbers: 'values'
        Stack<Integer> values = new
                              Stack<Integer>();
 
        // Stack for Operators: 'ops'
        Stack<Character> ops = new
                              Stack<Character>();
 
        for (int i = 0; i < tokens.length; i++)
        {
             
            // Current token is a 
            // whitespace, skip it
            if (tokens[i] == ' ')
                continue;
 
            // Current token is a number, 
            // push it to stack for numbers
            if (tokens[i] >= '0' && 
                 tokens[i] <= '9')
            {
                StringBuffer sbuf = new
                            StringBuffer();
                 
                // There may be more than one 
                // digits in number
                while (i < tokens.length && 
                        tokens[i] >= '0' && 
                          tokens[i] <= '9')
                    sbuf.append(tokens[i++]);
                values.push(Integer.parseInt(sbuf.
                                      toString()));
               
                // right now the i points to 
                // the character next to the digit,
                // since the for loop also increases 
                // the i, we would skip one 
                //  token position; we need to 
                // decrease the value of i by 1 to
                // correct the offset.
                  i--;
            }
 
            // Current token is an opening brace, 
            // push it to 'ops'
            else if (tokens[i] == '(')
                ops.push(tokens[i]);
 
            // Closing brace encountered, 
            // solve entire brace
            else if (tokens[i] == ')')
            {
                while (ops.peek() != '(')
                  values.push(applyOp(ops.pop(), 
                                   values.pop(), 
                                 values.pop()));
                ops.pop();
            }
 
            // Current token is an operator.
            else if (tokens[i] == '+' || 
                     tokens[i] == '-' ||
                     tokens[i] == '*' || 
                        tokens[i] == '/')
            {
                // While top of 'ops' has same 
                // or greater precedence to current
                // token, which is an operator.
                // Apply operator on top of 'ops'
                // to top two elements in values stack
                while (!ops.empty() && 
                       hasPrecedence(tokens[i], 
                                    ops.peek()))
                  values.push(applyOp(ops.pop(), 
                                   values.pop(),
                                 values.pop()));
 
                // Push current token to 'ops'.
                ops.push(tokens[i]);
            }
        }
 
        // Entire expression has been 
        // parsed at this point, apply remaining
        // ops to remaining values
        while (!ops.empty())
            values.push(applyOp(ops.pop(), 
                             values.pop(), 
                           values.pop()));
 
        // Top of 'values' contains 
        // result, return it
        return values.pop();
    }
 
    // Returns true if 'op2' has higher 
    // or same precedence as 'op1',
    // otherwise returns false.
    public static boolean hasPrecedence(
                           char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && 
            (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }
 
    // A utility method to apply an 
    // operator 'op' on operands 'a' 
    // and 'b'. Return the result.
    public static int applyOp(char op, 
                           int b, int a)
    {
        switch (op)
        {
        case '+':
            return a + b;
        case '-':
            return a - b;
        case '*':
            return a * b;
        case '/':
            if (b == 0)
                throw new
                UnsupportedOperationException(
                      "Cannot divide by zero");
            return a / b;
        }
        return 0;
    }

}

public class Main {

  public static void main(String [ ] args) {
      
    Scanner sc = new Scanner(System.in);  
      
    ArrayList<Character> symbols_list = new ArrayList<Character>();
    
    symbols_list.add('+');
    symbols_list.add('-');
    symbols_list.add('/');
    symbols_list.add('*');
    symbols_list.add('x');
    symbols_list.add('(');
    symbols_list.add(')');
    

    String s = "",infix_expr=" ";
    int M=0,P=0;

    s = sc.nextLine();
    P=sc.nextInt();
    M=sc.nextInt();
    
    
    StringBuilder sb = new StringBuilder(s);
    
    String prev_digits="";
    
    // Convert to proper space separated Infix notation
    for(int i=0; i<sb.length();i++){
        if( symbols_list.contains(sb.charAt(i))){
            if(prev_digits.equals("")==false){
                infix_expr+=(prev_digits+" "+(Character.toString(sb.charAt(i))+" "));
                prev_digits="";
            }else{
            infix_expr+=((Character.toString(sb.charAt(i))+" "));
            }
        }else{
            if(Character.isDigit(sb.charAt(i))==true){
                prev_digits+=(Character.toString(sb.charAt(i)));
            }
        }
    }
    
    // trim the spaces
    String trimmed = infix_expr.trim();
    
    // substitute 0 to 106, until you arrive at the answer
    for(int i=0;i<106;i++){
        if( (EvaluateString.evaluate(trimmed.replace("x",Integer.toString(i)))%M)==P ){
            System.out.println(i);// print the result
            break;
        }
    }
}

}
/*
Input:

20+3+x
0
5

Output:
2

*/
