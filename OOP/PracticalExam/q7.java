/*

ii. Hari is a civil engineer who is designing a fountain in square shape with water sprinklers in the edges with n number of steps. He needs to draw a sketch of the fountain in top view with the step number at the edges of the square.

Write a Java program to help him in printing the pattern with n number of steps.

Input Format
Input is an positive integer describing the step levels of the fountain.

Output Format
Output consists of the pattern of numbers as described in the question for n number of step levels.

Sample 1 Input
5
Sample 1 Output
1               1 
  2           2 
    3       3 
      4   4 
        5 
      4   4 
    3       3 
  2           2 
1               1

*/
import java.util.Scanner;

class Main
{



  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    int i, j, N;
    int count;
    int num = 1;

    N = sc.nextInt ();

    count = N * 2 - 1;

    for (i = 1; i <= count; i++)
      {
	for (j = 1; j <= count; j++)
	  {
	    if (j == i || (j == count - i + 1))
	      {
		System.out.print (num);
	      }
	    else
	      {
		System.out.print (" ");
	      }
	  }

	System.out.println ();
	if (num < N && i < N)
	  {
	    num++;
	  }
	else
	  {
	    num--;
	  }
      }

  }
}
