/*
int[] myList = new int[10]; This problem will test your knowledge on java array. You are given an array of n integers. A sub-array is "Negative" if sum of all the integers 
in that sub-array is negative. Count the number of "Negative sub-arrays" in the input array.

Note: Subarrays are contiguous chunks of the main array. For example if the array is {1,2,3,5} then some of the subarrays are {1}, {1,2,3}, {2,3,5}, {1,2,3,5} etc.
But {1,2,5} is not an subarray as it is not contiguous.

Input Format
The first line consists an integer n. The next line will contain n space separated integers. Value of n will be at most 100. The numbers in the array will range between -10000 
to 10000.

Output Format
Print the answer to the problem.

Sample Input
5 1 -2 4 -5 1 

Sample Output
9

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
        int n,i,sum=0,j,count=0,num;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        arr[i]=in.nextInt();
        
        for(i=0;i<n;i++)
        {
            sum=0;            
            for(j=i;j<n;j++)
            {
                sum+=arr[j];
                if(sum<0)
                {
                count++;
                }
            }
        }
        System.out.print(count);
    }
}

