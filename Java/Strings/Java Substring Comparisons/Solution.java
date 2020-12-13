/*
Input Format
The first line contains a string denoting s.
The second line contains an integer denoting k.

Output Format
Return the respective lexicographically smallest and largest substrings as a single newline-separated string.

Sample Input 0
welcometojava
3

Sample Output 0
ava
wel

SOLUTION->

*/

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0;i<=s.length()-k;i++)
        {
            String subStr=s.substring(i,i+k);
            if(i==0)
            {
                smallest=subStr;
            }
            if(subStr.compareTo(smallest)<0)
            {
                smallest=subStr;
            }
            else if(subStr.compareTo(largest)>0)
            {
                largest=subStr;
            }
        }
        return smallest + "\n" + largest;
    }

