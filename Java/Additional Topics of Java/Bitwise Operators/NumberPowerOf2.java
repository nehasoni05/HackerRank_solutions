/*
Check the number is power of 2 or not
Given a number, find our if it is a power of 2 or not.

Sample Input
13

Sample Output
0
*/

import java.util.*;
public class NumberPowerOf2
{
    static int powerOf2(int num)
    {
        if ((num & (num - 1)) != 0)
            return 0;
          return 1;
    }
    public static void main(String[] args)
    {
      Scanner in=new Scanner(System.in);
      int n;
      n=in.nextInt();
      System.out.print(powerOf2(n));
    }
}
