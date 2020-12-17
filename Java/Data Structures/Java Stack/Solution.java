/* Java Stack

Problem Statement
A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. 
if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})" 
Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

Given a string, determine if it is balanced or not.
Input Format
There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.
The part of the code that handles input operation is already provided in the editor.

Output Format
For each case, print 'true' if the string is balanced, 'false' otherwise.

Sample Input
{}()
({()})
{}(
[]

Sample Output
true
true
false
true

SOLUTION->
*/

import java.util.*;
class Solution
{
	int top=-1;
    int maxSize;
    char[] stack;
    public Solution(int length)
    {
        maxSize=length;
        stack=new char[length];
    }
    public void push(char ch)
    {
        if(top==maxSize)
        {
            //System.out.println("Stack overflow");
            return;
        }
        else
        top++;
        stack[top]=ch;
    }
    public int pop(char ch)
    {
        if(top==-1)
        {
          //  System.out.println("stack underflow");
            return -1;
        }
        else
        {
        if(stack[top]=='[' && ch==']' || stack[top]=='{' && ch=='}' || stack[top]=='(' &&        ch==')')
            {
                top--; 
                return 1; 
            }
            else 
            return 0;
        }
    }
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		int i,pushVar=0,popVar=0;
		while (sc.hasNext()) 
        {
            pushVar=0;
            popVar=0;
			String input=sc.next();
            //Complete the code
            Solution obj=new Solution(input.length());
            for(i=0;i<input.length();i++)
            {
                if(input.charAt(i)=='[' || input.charAt(i)=='{' || input.charAt(i)=='(')
                {
                obj.push(input.charAt(i));
                pushVar++;
                }   
                else if(input.charAt(i)==']' || input.charAt(i)=='}' || input.charAt(i)==')')
                {
                    popVar+=obj.pop(input.charAt(i));   
                }
            }
            if(pushVar==popVar)
            System.out.println("true");
            else
            System.out.println("false");
         
		}
		
	}
}
