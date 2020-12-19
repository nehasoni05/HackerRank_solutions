/* Covariant Return Types
Java allows for Covariant Return Types, which means you can vary your return type as long you are returning a 
subclass of your specified return type.
Method Overriding allows a subclass to override the behavior of an existing superclass method and specify a 
return type that is some subclass of the original return type.
Note: It is best practice to use the @Override annotation when overriding a superclass method.
We will append a hidden  class to test your code; the  method in our test class takes the 
name of a state as input and prints the national flower of that state using the classes and 
methods you written by you.
Resources 
Covariant Return Type 
Java Covariant Type

Input Format
Input is handled for you by the hidden  test class.
Output Format
Output is handled for you by the hidden  test class.

Sample Input
A single line containing the name of a State:
AndhraPradesh

Sample Output
A single line containing the national flower of the State received as input:
Lily

SOLUTION->
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Complete the classes below
class Flower
{
    String whatsYourName()
    {
        return "I have many names and types";
    }
}

class Jasmine extends Flower
{
    @Override
    String whatsYourName()
    {
        return "Jasmine";
    }
}

class Lily extends Flower
{
    @Override
    String whatsYourName()
    {
        return "Lily";
    }
}

class Region 
{
    Flower yourNationalFlower()
    {
        return new Flower();
    }
}

class WestBengal extends Region
{
    @Override
    Flower yourNationalFlower()
    {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region
{
    @Override
    Flower yourNationalFlower()
    {
        return new Lily();
    }
}


public class Solution {
  public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String s = reader.readLine().trim();
      Region region = null;
      switch (s) {
        case "WestBengal":
          region = new WestBengal();
          break;
        case "AndhraPradesh":
          region = new AndhraPradesh();
          break;
      }
      Flower flower = region.yourNationalFlower();
      System.out.println(flower.whatsYourName());
    }
}
