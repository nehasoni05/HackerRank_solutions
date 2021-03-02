/*
Task
Given a base-10 integer,n , convert it to binary (base-)2. Then find and print the base- integer denoting the maximum number of consecutive ‘s in ‘s binary representation.

Sample Input 1
5
Sample Output 1
1

Sample Input 2
13
Sample Output 2
2
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

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int count=0,min=0;
        while(n!=0)
        {
            if(n%2==1)
            {
                count++;
                if(count>min)
                min=count;
            }
            else
            count=0;
            n=n/2;
        }
        System.out.print(min);
        scanner.close();
    }
}
