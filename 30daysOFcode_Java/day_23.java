/*
Task:- A level-order traversal, also known as a breadth-first search, visits each level of a tree's nodes from left to right, top to bottom. You are given a pointer root pointing
to the root of a binary search tree. Complete the levelOrder function provided in your editor so that it prints the level-order traversal of the binary search tree.

Sample Input

6
3
5
4
7
2
1

Sample Output
3 2 5 1 4 7 

*/

import java.io.*;
import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

	static void levelOrder(Node root)
    {
      //Write your code here
      if(root==null)
      return;
      
      int level=1;
      while(printLevel(root,level))
      {
          level++;
      }
    }
    static boolean printLevel(Node root,int level)
    {
        if(root==null)
        return false;
        else if(level==1)
        {
            System.out.print(root.data+" ");
            return true;
        }
        else
        {
            boolean left=printLevel(root.left,level-1);
            boolean right=printLevel(root.right,level-1);
            return left||right;
        }
    }

	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}
