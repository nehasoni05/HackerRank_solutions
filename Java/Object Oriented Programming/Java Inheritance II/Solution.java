/* Java Inheritance
Take a look at the following java code:
class Solution
{
    public static void main(String []argh){
        Adder X=new Adder();
        System.out.println("My superclass is: "+X.getClass().getSuperclass().getName());    
        System.out.print(X.add(10,32)+" "+X.add(10,3)+" "+X.add(10,10)+"\n");
    }
}
The main function in Solution class creates an object of Adder class. Then it prints the name of the class that Adder inherited and calls the add method several times.
Now complete this code so that it outputs the following lines:
My superclass is: Arithmetic
42 13 20
You don't need to write the Solution class. We will append your code with the code given above before running it.If you need to write more than one class, write them in a single 
file. Your classes shouldn't be public.

Sample Input
No input.

Sample Output
My superclass is: Arithmetic
42 13 20

Solution->
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Write your code here
class Arithmetic
{
    public int add(int a,int b)
    {
        return a+b;
    }
}
class Adder extends Arithmetic
{

}
public class Solution{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();
        
        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
        
        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}
