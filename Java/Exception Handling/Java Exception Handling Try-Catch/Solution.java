/* Java Exception Handling Try Catch
This problem will test your knowledge on try-catch block.
You will be given two integers x and y as input, you have to compute x/y. If x and y are not 32 bit signed integers or if y is zero, exception will occur and you have to report it. 
Read sample Input/Output to know what to report in case of exceptions.

Sample Input 1:
10
3
Sample Output 1:
3

Sample Input 2:
10
Hello
Sample Output 2:
java.util.InputMismatchException

Sample Input 3:
10
0
Sample Output 3:
java.lang.ArithmeticException: / by zero

Sample Input 4:
23.323
0
Sample Output 4:
java.util.InputMismatchException

SOLUTION->
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int a,b,c;
        Scanner in=new Scanner(System.in);
        try
        {
            a=in.nextInt();
            b=in.nextInt();
            c=a/b;
            System.out.println(c);
        }
        catch(InputMismatchException e)
        {
            System.out.println("java.util.InputMismatchException");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
