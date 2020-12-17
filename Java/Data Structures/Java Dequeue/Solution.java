/* Java Deque
In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that generalizes a queue, for which elements can be 
added to or removed from either the front (head) or back (tail).

In this problem, you are given N integers. You need to find the maximum number of unique integers among all the possible contiguous subarrays of size M.

Input Format
The first line of input contains two integers N and M: representing the total number of integers and 
the size of the subarray, respectively. The next line contains N space separated integers.

Output Format
Print the maximum number of unique integers among all possible contiguous subarrays of size M separated by a space.

Sample Input
6 3
5 3 5 2 3 2

Sample Output
3

SOLUTION->
*/

    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new ArrayDeque<>();
            int n = in.nextInt();
            int m = in.nextInt();           
            int uniq=0;
            for (int i = 0; i < n; i++)
            {
                int num = in.nextInt();
               if(i==0)
               {
                  deque.add(num);
                  uniq++; 
               }
               else
               {
                   if(deque.size()==m)
                   {
                       deque.removeFirst();
                   }
                   else
                   {
                       if(!deque.contains(num) && uniq<m)
                       uniq++;
                   }
               }
            }
            System.out.print(uniq);
        }
    }
