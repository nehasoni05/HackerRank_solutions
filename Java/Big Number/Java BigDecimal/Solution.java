 /*
Java BigDecimal
Java BigDecimal class can handle arbitrary-precision signed decimal numbers. Lets test your knowledge on them!
You are given n real numbers, sort them in descending order! Read data from System.in.
Note: To make the problem easier, we provided you the input/output part in the editor. Print the numbers as 
they appeared in the input, don't change anything. If two numbers represent numerically equivalent values, 
the output must list them in original order of the input.
Input Format
The first line will consist an integer n, each of the next n lines will contain a real number. n will be at most 200. 
The numbers can have at most 300 digits!
Output Format
Print the numbers in descending orders, one number in each line.
Sample Input
9
-100
50
0
56.6
90
0.12
.12
02.34
000.000
Sample Output
90
56.6
50
02.34
0.12
.12
0
000.000
-100

SOLUTION->
*/

import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here
       Arrays.sort(s,0,n, new Comparator<Object>() {
       @Override
       public int compare(Object a1, Object a2) {
           BigDecimal bigDec1 = new BigDecimal((String)a1);
           BigDecimal bigDec2 = new BigDecimal((String)a2);
           return bigDec2.compareTo(bigDec1);
       }
       });
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
