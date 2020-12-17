/* Java Comparator
Comparators are used to compare two objects to sort them. This problem will test your knowledge on Java Comparators.

There are N players in a tournament. You will be given the name of each player and his score. You need to sort the players in decreasing order by score. If two players have the 
same score, the one whose name is lexicographically larger should appear first.

Input Format
The first line contains an integer N, denoting the number of players. The next N lines contain the name of a player and his score separated by a space. Two players can have
the same name. A name will consist of lowercase English characters. The score of a player can range from 0 to 1000. You don't need to worry about any other constraints.

Output Format
Print each player and their space-separated score on a different line according to the directions in the problem statement.

Sample Input
5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150

Sample Output
aleksa 150
david 100
amy 100
aakansha 75
heraldo 50

SOLUTION->
*/

import java.util.*;

// Write your Checker class here
class Checker implements Comparator<Player>
{
    public int compare(Player a,Player b)
    {
        if((a.score)==(b.score))
        {
            return (a.name).compareTo(b.name);
        }
        return b.score-a.score;
    }
}
class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
