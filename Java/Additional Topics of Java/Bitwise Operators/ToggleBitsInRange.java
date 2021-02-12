/*
Toggle bits in the given range
Given a number n and two positions l and r. Your task is to toogle all bits from leftmost lth bit to rightmost rth bit of the number n (inclusive l and r with 0 based indexing on 
64-bit machine where integer takes 4 bytes).

Sample Input
10
2
3
Sample Output:
6

Explanation:-In 8-bits, 10 is 0000 1010, now toogle the bits from position 2 to 3 (inclusive) from lsb, it becomes 0000 0110. which is 6
*/

import java.util.*;
public class ToggleBitsInRange
{
 static int toggleRangeBits(int num, int l, int r)
  {
    l=l+1;
    r=r+1;
    int n = ((1 << r) - 1) ^ ((1 << (l - 1)) - 1); 
        return (num ^ n);
  } 
  public static void main (String[] args)  
    { 
        Scanner in=new Scanner(System.in);
        int n = in.nextInt(); 
        int l = in.nextInt();
        int r = in.nextInt(); 
        System.out.println(toggleRangeBits(n, l, r)); 
    } 
} 
