/*
Task
Write a factorial function that takes a positive integer, as a parameter and prints the factorial, Using Recursion technique.
Note: If you fail to use recursion or fail to name your recursive function factorial or Factorial, you will get a score of .

Sample Input
3

Sample Output
6
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution 
{
    static int factorial(int n) 
    {
        if(n==1 || n==0)
        return 1;
        else
        return n*factorial(n-1);        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException 
    {
        int n = scanner.nextInt();
        int result = factorial(n);
        System.out.print(result);
        
        scanner.close();
    }
}
