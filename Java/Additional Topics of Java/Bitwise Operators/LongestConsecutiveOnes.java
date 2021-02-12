/*
Longest Consecutive 1’s
Given a number n, find length of the longest consecutive 1s in its binary representation

Sample Input
2             //testcases
23
222

Sample Output
3
4

Explanation: if number is 222, in binary it is 11011110
*/

import java.util.*;
public class LongestConsecutiveOnes
{
 static int consecutiveOnes(int num)
  {
    int count=0;
    while(num!=0)
    {
      num=(num & (num << 1));
      count++;
    }
	return count;
  }
  public static void main(String strings[]) 
    { 
        Scanner in=new Scanner(System.in);
        int t,n;
        t=in.nextInt();
        while(t--!=0)
        {
        n=in.nextInt();
        System.out.println(maxConsecutiveOnes(n)); 
        }
        
    }
}    
