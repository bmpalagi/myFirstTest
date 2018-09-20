
/**
 * change the class name to -- firstlast_parentheses
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class firstlast_parentheses
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
    public static void  main(String args)
    {
        //Test if stack is empty balanced
        String quiz1 = "-((b*b-(4*a*c))/(2*a))";//balanced
        //Test if parentheses don't match
        String quiz2 = "-{[b*b-(4*a*c)]/(2*a)}";//balanced

        //Test if stack is empty balanced
        String quiz3 = "-((b*b-(4*a*c))/(2*a)";//unbalanced
        //Test if parentheses don't match
        String quiz4 = "-{[b*b-(4*a*c)]/(2*a}";//unbalanced

    }
}
