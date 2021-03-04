/*
Task 

You are given two classes, Person and Student, where Person is the base class and Student is the derived class. Completed code for Person and a declaration for Student are 
provided for you in the editor. Observe that Studentinherits all the properties of Person.

Complete the Student class by writing the following:

A Student class constructor, which has  parameters:
A string, .
A string, .
An integer, .
An integer array (or vector) of test scores, .
A char calculate() method that calculates a Student object’s average and returns the grade character representative of their calculated average:

Sample Input
Heraldo Memelli 8135627
2
100 80

Sample Output
 Name: Memelli, Heraldo
 ID: 8135627
 Grade: O
*/

import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
    public Student(String fName,String lName,int id,int[] scores )
    {
        super(fName,lName,id);
        this.testScores=scores;
    }
    public char calculate()
    {
        int sum=0,avg,i;
        for(i=0;i<testScores.length;i++)
        sum+=testScores[i];
        avg=(int)sum/testScores.length;
        
        if(avg>=90 && avg<=100)
        return 'O';
        
        else if(avg>=80 && avg<=90)
        return 'E';
        
        else if(avg>=70 && avg<=80)
        return 'A';
        
        else if(avg>=55 && avg<=70)
        return 'P';
        
        else if(avg>=40 && avg<=55)
        return 'D';
        
        else
        return 'T';
    }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}
