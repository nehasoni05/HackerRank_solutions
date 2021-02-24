/*
Write a Person class with an instance variable, age, and a constructor that takes an integer, initialAge, as a parameter. The constructor must assign initialAge to age after 
confirming the argument passed as initialAge is not negative; if a negative argument is passed as initialAge, the constructor should set age to 0 and print Age is not valid, 
setting age to 0. In addition, you must write the following instance methods:

yearPasses() should increase the age instance variable by 1.
amIOld() should perform the following conditional actions:
If age < 13, print You are young.
If age>=13 and age<18, print You are a teenager.
Otherwise, print You are old.

Sample Input
4
-1
10
16
18

Sample Output
Age is not valid, setting age to 0.
You are young.
You are young.

You are young.
You are a teenager.

You are a teenager.
You are old.

You are old.
You are old.
*/

import java.io.*;
import java.util.*;

public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
          if(initialAge<0)
          {
          initialAge=0;
          age=initialAge;
          System.out.println("Age is not valid, setting age to 0.");
          }
          else
          age=initialAge;
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
          
          if(age<13)
            System.out.println("You are young.");
          else if(age>=13 && age<18)
            System.out.println("You are a teenager.");
          else
            System.out.println("You are old.");
	}

	public void yearPasses() {
  		// Increment this person's age.
          age=age+1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}
