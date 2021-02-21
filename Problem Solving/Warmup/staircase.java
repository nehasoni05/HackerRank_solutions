/*
Sample Input

6 
Sample Output

     #
    ##
   ###
  ####
 #####
######

Explanation

The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of n=6.
*/

import java.util.*;
public class staircase 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
           for(j=1;j<=n;j++)
           {
               if(j<=n-i)
               System.out.print(" ");
               else 
               System.out.print("#");
           }
           System.out.println();
        }
    }
}
