/*
In this problem we will test your knowledge on Java Priority Queue.
There are a number of students in a school who wait to be served. Two types of events, ENTER and SERVED, can take place which are described below.

ENTER: A student with some priority enters the queue to be served.
SERVED: The student with the highest priority is served (removed) from the queue.
A unique id is assigned to each student entering the queue. The queue serves the students based on the following criteria (priority criteria):

The student having the highest Cumulative Grade Point Average (CGPA) is served first.
Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
Any students having the same CGPA and name will be served in ascending order of the id.
Create the following two classes:

Output Format.
The locked stub code prints the names of the students yet to be served in the priority order. If there are no such student, then the code prints EMPTY.


Sample Input 0
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50
SERVED

Sample Output 0
Dan
Ashley
Shafaet
Maria

SOLUTION->
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */
 import java.util.*;
 class Student implements Comparable<Student>
 {
      int id;
      double cgpa;
      String name;
     public Student(int i,String n,double c)
     {
         id=i;
         name=n;
         cgpa=c;
     }
     public int getID()
     {
     return id;
     }
     public String getName()
     {
         return name;
     }
     public double getCGPA()
     
     {
         return cgpa;
     }
     
     public int compareTo(Student a)
     {
         if(cgpa==a.cgpa)
         {
             if(name.compareTo(a.name)==0)
             {
                 return id-a.id;
             }
             else
             {
                 return name.compareTo(a.name);
             }
         }
         else
         {
             if(cgpa<a.cgpa)
             return 1;
             else
             return -1;
         }
     }
 }
class Priorities 
{
    public List<Student> getStudents(List<String> events)
    {
         PriorityQueue<Student> pQueue = new PriorityQueue<Student>();
         
        for(String item:events)
        {
          String[] data=new String[4];
          data=item.split("\\s");
          if(data.length>1)                   //entry
          {
              Student obj=new Student(Integer.valueOf(data[3]),data[1],Double.valueOf(data[2]));
              pQueue.add(obj);
          }   
          else
          {
              pQueue.poll();
          }
        }
        while(pQueue.size()>1)
        {
            System.out.println(pQueue.poll().name);
        }
        ArrayList<Student> aList=new ArrayList<Student>(pQueue);
        
        return aList;
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
