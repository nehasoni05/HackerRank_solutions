/*
Given a large integer n , use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.

Input Format
A single line containing an integer,  (the number to be checked).

Output Format
If  is a prime number, print prime; otherwise, print not prime.

Sample Input0
13
Sample Output0
prime


Sample Input1
34263233064835421125264776608163440537925705997962346596977803462033841059628723
Sample Output
prime

SOLUTION->

*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger n = scanner.nextBigInteger();
        
        scanner.close();
        if(n.isProbablePrime(1))
        {
            System.out.print("prime");
        }
        else
        {
            System.out.print("not prime");
        }
    }
}
