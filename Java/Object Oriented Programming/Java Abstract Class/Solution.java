/* Java Abstract Class 
A Java abstract class is a class that can't be instantiated, that means you cannot create 
new instances of an abstract class. It works as a base for subclasses. You should learn about 
Java Inheritence before attempting this challenge.
Following is an example of abstact class:
abstract class Book
{
    String title;
    abstract void setTitle(String s);
    String getTitle()
    {
        return title;
    }
}
If you try to create an instance of this class like the following line you will get an error:
Book new_novel=new Book(); 

You have to create another class that extends the abstract class. Then you can create instance of the new class.

Notice that setTitle method is abstract too and has no body. That means you must implement the body of the that method in the child class.

Sample Input
A tale of two cities

Sample Output
The title is: A tale of two cities

SOLUTION->
*/

import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
}

//Write MyBook class here
class MyBook extends Book
{
public void setTitle(String s)
{
    title=s;
} 
}
public class Main{
	
	public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}
