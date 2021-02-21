/*
Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with 6 places 
after the decimal.

Sample Input
6               
-4 3 -9 0 4 1   

Sample Output
0.500000
0.333333
0.166667

Explanation

There are 3 positive numbers, 2 negative numbers, and 1 zero in the array.
The proportions of occurrence are positive: 3/6=0.500000,  negative: 2/6=0.333333 and zeros: 1/6=0.166667.
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int i,n,positive=0,negative=0,zeroes=0;
        n=in.nextInt();
        int[] a=new int[n];
        
        for(i=0;i<n;i++)
        {
        a[i]=in.nextInt();
        if(a[i]>0)
        positive++;
        else if(a[i]<0)
        negative++;
        else if(a[i]==0)
        zeroes++;
        }
        System.out.println(positive/(double)n);
        System.out.println(negative/(double)n);
        System.out.println(zeroes/(double)n);
          
    }
}
