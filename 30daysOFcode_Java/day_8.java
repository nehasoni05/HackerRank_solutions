/*
Task
Given names and phone numbers, assemble a phone book that maps friends’ names to their respective phone numbers. You will then be given an unknown number of names to query your 
phone book for. For each queried, print the associated entry from your phone book on a new line in the form name=phoneNumber; if an entry for is not found, print Not found instead.

Note: Your phone book should be a Dictionary/Map/HashMap data structure.

Sample Input
3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry

Sample Output
sam=99912222
Not found
harry=12299933
*/

import java.util.*;
import java.io.*;

class Solution{
    
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(map.containsKey(s))
            System.out.println(s+"="+map.get(s));
            else
            System.out.println("Not found");
        }
        in.close();
    }
}
