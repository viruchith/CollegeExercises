/*
"Axcent Academy" has arranged for a competitive test for medical students from rural villages. Those successful students of the test will be awarded the scholarship for their NEET preparations at Axcent Academy. Benny, the co-coordinator and founder of the academy has given one problem for the first stage of the test. The problem goes like this:

Given an array A1, A2, ..., AN, count the number of subarrays of array A which are non-decreasing.

A subarrayA[i,j], where 1 ≤ i ≤ j ≤ N is a sequence of integers Ai, Ai+1, ..., Aj.

A subarrayA[i,j] is non-decreasing if Ai ≤ Ai+1 ≤ Ai+2 ≤ ... ≤ Aj. Count the total number of such subarrays.

Benny himself has not computed the solution of the problem. Write a program to help him find the answer for the same to evaluate the students.

Input Format

The first line of input contains a single integer N denoting the size of array. Assume that the maximum value for N as 50.

The second line contains N space-separated integers A1, A2, ...,AN denoting the elements of the array.

Constraints

None

Output Format

Output in a single line, the count of the total number of such subarrays.

Sample Input 0

4
1 4 2 3

Sample Output 0

6

Sample Input 1

3
3 1 4

Sample Output 1

4

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int count = 1;
            int prevCount = 1;
            int prevNum = sc.nextInt();
            for(int i=1; i<n; i++){
                int temp = sc.nextInt();
                if(temp >= prevNum){
                   ++prevCount;
                }else{
                   prevCount = 1;
                }
                count += prevCount;
                prevNum = temp;
            }
            System.out.println(count);
    }
}
