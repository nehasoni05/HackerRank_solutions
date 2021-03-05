/*
Task 

Given a Book class and a Solution class, write a MyBook class that does the following:

Inherits from Book
Has a parameterized constructor taking these  parameters:
string 
string 
int 
Implements the Book class’ abstract display() method so it prints these  lines:
Title, a space, and then the current instance’s .title
Author, a space, and then the current instance’s .author
Price, a space, and then the current instance’s .price

Sample Input
The Alchemist
Paulo Coelho
248

Sample Output
Title: The Alchemist
Author: Paulo Coelho
Price: 248
*/

import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

// Declare your class here. Do not use the 'public' access modifier.
class MyBook extends Book
{
    int price;
    public MyBook(String t,String a,int p)
    {
        super(t,a);
        price=p;
    }
    void display()
    {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.print("Price: "+price);
        
    }
}
   
public class Solution {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
