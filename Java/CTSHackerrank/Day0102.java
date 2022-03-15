/*
Stella and friends have set out on a vacation to Manali. They have booked accommodation in a resort and the resort authorities headed by Bob, organize Camp fires every night as a part of their daily activities. Stella volunteered herself for an activity called the "Stick Game".

Stella was given a total of N sticks. Length of i-th stick is Ai. Bob insists Stella to choose any four sticks and to make a rectangle with those sticks as its sides. Bob warns Stella not to break any of the sticks, she has to use sticks as a whole.

Also, Bob wants that the rectangle formed should have the maximum possible area among all the rectangles that Stella can make. Stella takes this challenge up and overcomes it. You have to help her know whether it is even possible to create a rectangle. If yes, then tell the maximum possible area of rectangle.

Input Format

The first line of the input contains a single integer N denoting the number of sticks.

The second line of each test case contains N space-separated integers A1, A2, ...,AN denoting the lengths of sticks.

Constraints

None

Output Format

Output a single line containing an integer representing the maximum possible area for rectangle or output -1, if it's impossible to form any rectangle using the available sticks.

Sample Input 0

5
1 2 3 1 2

Sample Output 0

2

Sample Input 1

4
1 2 2 3

Sample Output 1

-1


*/



import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        sc.nextLine();
        
        Integer[] arr = Arrays.stream(sc.nextLine().split("\\s")).mapToInt(i->Integer.parseInt(i)).boxed().toArray(Integer[]::new);
        
        Arrays.sort(arr,Collections.reverseOrder());
        
        int[] dimension = { 0, 0 }; 
       
        for (int i = 0, j = 0; i < arr.length - 1 && j < 2;  i++){ 
            if (arr[i] == arr[i + 1]) 
                dimension[j++] = arr[i++]; 
        }
        
        int area = dimension[0]*dimension[1];
        
        System.out.println(area<=0?-1:area);
    }
}
