/*
Task
Read a string, , and print its integer value; if cannot be converted to an integer, print Bad String.

Note: You must use the String-to-Integer and exception handling constructs built into your submission language. If you attempt to use loops/conditional statements, you will get 
a score.

Sample Input 0
3
Sample Output 0
3

Sample Input 1
za
Sample Output 1
Bad String
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        try
        {
            int num=Integer.valueOf(S);
            System.out.print(num);
        }
        catch(Exception e)
        {
            System.out.print("Bad String");
        }
    }
}
