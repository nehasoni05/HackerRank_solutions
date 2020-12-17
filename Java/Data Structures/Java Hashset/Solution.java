/* Java Hashset

You are given n pairs of strings. Two pairs (a,b) and (c,d) are identical if a=c and b=d. That also implies (a,b) 
is not same as (b,a). After taking each pair as input, you need to print number of unique pairs you currently have.

Input Format
In the first line, there will be an integer T denoting number of pairs. Each of the next T lines will contain two 
strings seperated by a single space.

Output Format
Print T lines. In the ith line, print number of unique pairs you have after taking ith pair as input.

Sample Input
5
john tom
john mary
john tom
mary anna
mary anna

Sample Output
1
2
2
3
3

SOLUTION->
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

//Write your code here
int count=0;
HashSet set1=new HashSet();
HashSet set2=new HashSet();
for(int i=0;i<pair_left.length;i++)
{
    if(set1.add(pair_left[i]+" "+pair_right[i]))
    count++;
    System.out.println(count);
}

    }
}
