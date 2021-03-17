/*
A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself. Given a number, n, determine and print whether it’s Prime or Not Prime.

Note: If possible, try to come up with a  primality algorithm, or see what sort of optimizations you come up with for an  algorithm. Be sure to check out the Editorial after 
submitting your code!

Sample Input

3
12
5
7
Sample Output

Not prime
Prime
Prime
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        /* Enter your code here. */
        int n,i,flag,t;
        Scanner in=new Scanner(System.in);
        t=in.nextInt();
        
        while(t--!=0)
        {
            n=in.nextInt();
            if(isPrime(n))
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println("Not prime");
            }
            
        }
    }
    static boolean isPrime(int n)
    {
        if(n<2)
        return false;
        
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
}
