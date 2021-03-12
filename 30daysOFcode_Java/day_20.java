/*
Task
Given an array, , of size containing distinct elements , sort array in ascending order using the Bubble Sort algorithm above. Once sorted, print the following lines:
where is the number of swaps that took place.
where is the first element in the sorted array.
where is the last element in the sorted array.

Sample Input 0
3
1 2 3
Sample Output 0
Array is sorted in 0 swaps.
First Element: 1
Last Element: 3
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++)
        {
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        int count_swaps=0,i,j,temp;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    count_swaps++;
                }
            }
        }
        System.out.println("Array is sorted in "+count_swaps+" swaps.");
        System.out.println("First Element: "+ a[0]);
        System.out.println("Last Element: "+a[n-1]);
        
    }
}
