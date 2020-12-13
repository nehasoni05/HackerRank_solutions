/*
Input Format

The first line contains an integer T , denoting the number of test cases.
Each test case T, is comprised of a single line with an integer N, which can be arbitrarily large or small.

Output Format

For each input variable n and appropriate primitive datatype, you must determine if the given primitives are capable of storing it. If yes, then print:
n can be fitted in:
* dataType

Sample Input

5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
Sample Output

-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long

Solution->
*/

import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)
                System.out.println("* byte");
                if(x>=-32768 && x<=32767)
                System.out.println("* short");
                if(x>=-2147483648 && x<=2147483647)
                System.out.println("* int");
                if(x>=-9223372036854775808L && x<=9223372036854775807L)
                System.out.println("* long");
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



