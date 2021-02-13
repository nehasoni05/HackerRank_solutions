/*
Find Missing Element
There is an array of non-negative integers. A second array is formed by shuffling the elements of the first array and deleting a random element. Given these two arrays, find 
which element is missing in the second array.

Input Parameters
2
5 4
1 2 3 4 5
3 4 1 2
7 6
1 2 3 4 5 6 7
4 5 6 3 7 2

Expected Output
5
1
*/

import java.util.*;
// Other imports go here
// Do NOT change the class name
class MissingElement
{
    public static void main(String[] args)
    {
      Scanner in=new Scanner(System.in);
      int i,j=0,n1,n2,t;
      int[] a1;
      int[] a2;
      t=in.nextInt();
      while(t--!=0)
      {
        int flag=-1;
        n1=in.nextInt();
        n2=in.nextInt();
        a1=new int[n1];
        a2=new int[n1];
        for(i=0;i<n1;i++)
          a1[i]=in.nextInt();
        for(i=0;i<n2;i++)
          a2[i]=in.nextInt();
        
        int mnum = 0; 
        for ( i = 0; i < n1; i++) 
            mnum = mnum ^ a1[i]; 
        for ( i = 0; i < n2; i++) 
            mnum = mnum ^ a2[i];
        System.out.println(mnum);
      }
    }
}
