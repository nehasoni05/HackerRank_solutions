  
/* Java List
Java's BitSet class implements a vector of bit values (i.e.:  () or  ()) that grows as needed, allowing us to easily manipulate bits while optimizing space (when compared to 
other collections). Any element having a bit value of  is called a set bit.

Given  BitSets,  and , of size  where all bits in both BitSets are initialized to, perform a series of  operations. After each operation, print the number of set bits 
in the respective BitSets as two space-separated integers on a new line.

Input Format
The first line contains  space-separated integers,  (the length of both BitSets  and ) 
and  (the number of operations to perform), respectively. 
The  subsequent lines each contain an operation in one of the following forms:
AND 
OR 
XOR 
FLIP
SET 

Output Format
After each operation, print the respective number of set bits in BitSet  and BitSet 
as space-separated integers on a new line.

Sample Input
5 4
AND 1 2
SET 1 4
FLIP 2 2
OR 2 1
Sample Output
0 0
1 0
1 1
1 2
 
 
SOLUTION-> 
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n,m;
        n=in.nextInt();
        m=in.nextInt();            //queries
       BitSet b1=new BitSet(n);
       BitSet b2=new BitSet(n);
       
       BitSet[] bitArray=new BitSet[3];
       bitArray[1]=b1;
       bitArray[2]=b2;
       
       while(m--!=0)
       {
           String bitOp=in.next();
           int x=in.nextInt();
           int y=in.nextInt();
           
           switch(bitOp)
           {
               case "AND":
               bitArray[x].and(bitArray[y]);
               break;
               
               case "SET":
               bitArray[x].set(y);
               break;
               
               case "FLIP":
               bitArray[x].flip(y);
               break;
               
               case "XOR":
               bitArray[x].xor(bitArray[y]);
               break;
               
               case "OR":
               bitArray[x].or(bitArray[y]);
               break;
           }
           System.out.println(b1.cardinality()+" "+b2.cardinality());
       }
       
    }
}
