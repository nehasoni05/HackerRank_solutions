/*
Task
Complete the Difference class by writing the following:
A class constructor that takes an array of integers as a parameter and saves it to the instance variable.
A computeDifference method that finds the maximum absolute difference between any numbers in and stores it in the instance variable.

Sample Input

3
1 2 5
Sample Output

4
Explanation

The scope of the array and integer is the entire class instance. The class constructor saves the argument passed to the constructor as the instance variable (where the computeDifference method can access it).

To find the maximum difference, computeDifference checks each element in the array and finds the maximum difference between any elements:


The maximum of these differences is , so it saves the value as the instance variable. The locked stub code in the editor then prints the value stored as , which is .
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    public Difference(int[] a)
    {
        elements=a;
    }
    public void computeDifference()
    {
        int i,diff;
        maximumDifference=-1;
        for(i=0;i<elements.length;i++)
        {
            for(int j=i+1;j<elements.length;j++)
            {
               diff=Math.abs(elements[i]-elements[j]);
               if(diff>maximumDifference)
               maximumDifference=diff;
            }
        }
    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
