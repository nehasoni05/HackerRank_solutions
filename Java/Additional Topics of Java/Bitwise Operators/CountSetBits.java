/*
Count the set bits
Every number is represented in binary form in memory. A binary form consists of bits, which can take only two values i.e. 0 or 1. Given an integer number you have to count number
of set bits in its binary representation.

Sample Input
3
4
5
14

Sample Output
1
2
3

Explanation
4 is 0100
5 is 0101
14 is 1110
*/

import java.util.*;
public class CountSetBits
{
  static int countBits(int num)
  {
    int count=0,m;
    while(num!=0)
    {
      m=num&1;
      if(m ==1)
        count++;
      num=num>>1;
    }
    return count;
  } 
  public static void main(String args[])
  {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(countBits(n));
  }
}
