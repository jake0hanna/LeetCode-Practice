public class ValidParentheses 
{

    public boolean isValid(String s) 
    {

        char[] c = s.toCharArray();
        Stack stack = new Stack<Character>();

        for(int i = 0; i < c.length; i++)
        {
            char currentChar = c[i];
            //if the character 'opens', put it on the stack 
            if(currentChar == '(' || currentChar == '{' || currentChar == '[')
            {

                stack.push(currentChar);


            }//if its not an 'open' character and the stack is empty (no currently open brackets waiting)
            //then it is invalid
            else if(stack.isEmpty())
            {   

                return false;


            }
            else
            {
            
                //top character
                char top = (Character)stack.pop();

                if (currentChar == ')' && top != '(') 
                {
                    return false;
                } else if (currentChar == '}' && top != '{') 
                {
                    return false;
                } else if (currentChar == ']' && top != '[') 
                {
                    return false;
                }

            }

        }

        //if everything finds a match then there should be nothing left
        return stack.isEmpty();

        
    }
}