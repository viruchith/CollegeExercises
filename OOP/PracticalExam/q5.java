/*

ii. The Warners Club arranged for a Recreation Fair for kids and adults for the winter season ahead. The Club offered outdoor activities for adults like hiking, cycling, power soccer and indoor activities like chess, carom and card games for kids below 10 years. Gary and Dory accompanied their parents for the fair and wanted to play the cricket collectable card game as they are crazy about the collectable cards.
In their spare time, they usually have a way of playing some game involving such cards. Both also have the habit of exchanging the repeated cards with their friends. That day at the Fair, Gary and Dory thought about a different game. With the cards in hand, each person tried to make an exchange with the other person following this simple rule: each person must count how many cards he owned. After this, they had to split these cards into stacks, all of it with the same size, as large as it was possible for both players. Then, each one chooses one of the friend's card stacks to receive.
For example, if Gary and Dory would change the cards with respectively 8 and 12 cards each, both must put his cards in stacks of four cards (Gary would have two stacks and Dory had three stacks), and both choose a stack from his friend to receive it.
Help Gary and Dory find the maximum size of the stack of cards which can be exchanged between the two players.
Hence create a class named Cards with the following method.


Create a driver class called Main. In the Main method, obtain input from the user in the console and display the maximum size of the stack of cards which can be exchanged between the two players by calling the findValue method present in the Cards class.
Input Format
The input consists of the amount of collectable cards that gary have to change and dory have to change separated by a space.
Output Format
Output the maximum size of the stack of cards which can be exchanged between the two players, in a single line.
Sample 1 Input

8 12
Sample 1 Output
4

Sample 2 Input

9 27
Sample 2 Output

9

*/


import java.util.Scanner;

class Main
{
    private static int gcd(int a, int b)
    {
        if (a == 0)
          return b;
        if (b == 0)
          return a;
      
        if (a == b)
            return a;
      
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
     
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a,b));
    }
}

