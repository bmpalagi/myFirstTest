import java.util.*;
//Brad Palagi
//Parentheses Quiz


public class bradPalagi_parentheses
{

    /**
     * A quiz
     * Exam whether an expression is correctly formed with Parentheses are balanced
     *
     * When you see an opening parenthesis, push it on the stack
     * When you see a closing parenthesis, pop the stack
     * If the opening and closing parentheses don't match
     *      The parentheses are unbalanced. Exit
     * If at the end the stack is empty
     *      The parentheses are balanced.
     * Else
     *      The parentheses are not balanced
     *
     * Write the code to test the above
     */
    public static void  main(String[] args)
    {
        //Test if stack is empty balanced
        String quiz1 = "-((b*b-(4*a*c))/(2*a))";//balanced
        //Test if parentheses don't match
        String quiz2 = "-{[b*b-(4*a*c)]/(2*a)}";//balanced

        //Test if stack is empty balanced
        String quiz3 = "-((b*b-(4*a*c))/(2*a)";//unbalanced
        //Test if parentheses don't match
        String quiz4 = "-{[b*b-(4*a*c)]/(2*a}";//unbalanced
        
        Stack<Character> s = new Stack<>();
        
        
        
        String string = quiz4; //CHANGE THIS TO TEST THE OTHER STRINGS
        
        
        //Loop through the entire string
        for (int x = 0; x < string.length(); x++)
        {
                        
            //if it finds a parentheses of any type it adds that character to the Stack
            if (string.charAt(x) == '(' || string.charAt(x) == '[' || string.charAt(x) == '{')
            {
                s.push(string.charAt(x));
                
            }
            
            //if finds a close parentheses of any type it checks to see that it matches the most recent type of open parentheses, and pops it off the stack
            if (string.charAt(x) == ')' || string.charAt(x) == ']' || string.charAt(x) == '}')
            {
                if (s.size()>0) // makes sure stack is not empty
                {
                    Character q = s.pop(); //sets the top value of stack equal to q so I can use it to check if the parentheses match
                    if (q == '(' && string.charAt(x) != ')') // checks for ( )
                    {
                        System.out.println("The parentheses dont match.");
                        break;
                    }
                    else if (q == '[' && string.charAt(x) != ']') //checks for [ ]
                    {
                        System.out.println("The parentheses dont match.");
                        break;
                    }
                    else if (q == '{' && string.charAt(x) != '}') //checks for { }
                    {
                        System.out.println("The parentheses dont match.");
                        break;
                    }
                }
                else // if the stack is empty
                {
                    System.out.println("The stack is empty, the parentheses are not balanced");
                    break;
                }
                
            }
            
        }
        
        //final check to see if there are any parentheses still on the stack
        if (s.size() == 0)
        {
            System.out.println("The parentheses are balanced.");
        }
        else
        {
            System.out.println("The parantheses are not balanced.");
        }
    }
}
