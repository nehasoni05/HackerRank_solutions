/*
Set the kth bit of a number
You are given a number N and another number k. Print the number after making the kth bit set, if not already set. (0 based indexing on 64-bit machine where integer takes 4 bytes).

Sample Input
10
2

Sample Output:
14

Explanation:
In 8-bits, 10 is 0000 1010, now setting the bit at position 2 from lsb, it be
*/


import java.util.*;
public class SetKthBit
{
  static int setKthBit(int num, int k)
  {
    int res=((1<<k)|num);
    return res;
  }
  public static void main(String[] args) 
    { 
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();                  
        int k = in.nextInt(); 
        System.out.print(setKthBit(n, k)); 
    } 
}    
