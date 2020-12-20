/* JavaLambdaExpressions
This Java 8 challenge tests your knowledge of Lambda expressions!
Write the following methods that return a lambda expression performing a specified action:
performOperation checkEvenOdd(): The lambda expression must return  if a number is even or  if it is odd.
performOperation checkPrime(): The lambda expression must return  if a number is prime or  if it is composite.
performOperation checkPalindrome(): The lambda expression must return  if a number is a palindrome or  if it is not.

Input Format
Input is handled for you by the locked stub code in your editor.

Output Format
The locked stub code in your editor will print  lines of output.

Sample Input
The first line contains an integer,  (the number of test cases).
The  subsequent lines each describe a test case in the form of  space-separated integers: 
The first integer specifies the condition to check for ( for Odd/Even,  for Prime, or  for Palindrome). 
The second integer denotes the number to be checked.
5
1 4
2 5
3 898
1 3
2 12

Sample Output
EVEN
PRIME
PALINDROME
ODD
COMPOSITE

SOLUTION->
*/

import java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }

   // Write your code here
    PerformOperation isOdd()
    {
        PerformOperation p = (a) ->{
                                        int res=a%2;
                                        if(res==1)
                                        return true;
                                        else
                                        return false;
                                   };
        return p;                        
    }
    
    PerformOperation isPrime()
    {
        PerformOperation p= (a) ->{
                                    if(a==1)
                                    return false;  
                                    for(int i=2;i<=a/2;i++)
                                    {
                                        if(a%i==0)
                                        return false;
                                    }  
                                    return true;
                                  };
        return p;                          
    }
    
    PerformOperation isPalindrome()
    {
        PerformOperation p = (a) ->{
                                        int originalNumber=a;
                                        int r,R=0;
                                        while(a!=0)
                                        {
                                            r=a%10;
                                            R=R*10+r;
                                            a=a/10;
                                        }
                                        if(R==originalNumber)
                                        return true;
                                        else
                                        return false;
                                   };
        return p;                           
    }
}
public class Solution {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}
