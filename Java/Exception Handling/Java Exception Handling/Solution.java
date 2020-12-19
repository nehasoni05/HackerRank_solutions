/* Java Exception Handling
Create a class myCalculator which consists of a single method power(int,int). This method takes two integers, 
n and p, as parameters and finds np. If either n or p is negative, then the method must throw an exception 
which says "n and p should be non-negative".
Please read the partially completed code in the editor and complete it. Your code mustn't be public.
No need to worry about constraints, there won't be any overflow if your code is correct.

Sample Input 0

3 5
2 4
0 0
-1 -2
-1 3

Sample Output 0
243
16
java.lang.Exception: n and p should not be zero.
java.lang.Exception: n or p should not be negative.
java.lang.Exception: n or p should not be negative.

SOLUTION->
*/

import java.util.Scanner;
class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    public int power(int num,int power) throws Exception
    {
        if(num==0 && power==0)
        {
            throw new Exception("n and p should not be zero.");
        }
        else if(num<0 || power<0)
        {
            throw new Exception("n or p should not be negative.");
        }
        else
        {
            int res=(int)Math.pow(num,power);
            return res;
        }
    }
    
}

public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
