/*
With the initiative of the Students Council of Sherland State University, the College Management has inaugurated a mini library in the hostel premises.There are N students living in the hostel. Any student can use the library but on a condition that only one student should avail it at a time. Based on this condition, the Hostel Warden came up with a timetable for library's usage in order to avoid the conflicts:

• The first student starts to use the library at the time O and should finish the reading not later than at the time A1.

• The second student starts to use the library at the time A1 and should finish the reading not later than at the time A2.

• And so on.

• The N-th student starts to use the library at the time AN-1 and should finish the reading not later than at the time AN

The holidays in Sherland are approaching, so today each of these N students wants to read some new edition of "Heart of Darkness". The i-th student needs Bi units of time to read the book.

The students have understood that probably not all of them will be able to read everything they want from the book. How many students will be able to read the book without violating the schedule?

Input Format

The first line of input contains a single integer N denoting the number of students. Assume that the maximum value for N as 50.

The second line contains N space-separated integers A1, A2, ...,AN denoting the moments of time by when the corresponding student should finish reading.

The third line contains N space-separated integers B1, B2, ...,BN denoting the time required for each of the students to read.

Constraints

None

Output Format

Output a single line containing the number of students that will be able to finish reading.

Sample Input 0

3
1 10 15
1 10 3

Sample Output 0

2

Sample Input 1

3
10 20 30
15 5 20

Sample Output 1

1


*/

import java.io.*;
import java.util.*;

public class Solution {

        public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
            
        int[] arr = Arrays.stream(sc.nextLine().split("\\s")).mapToInt(i->Integer.parseInt(i)).toArray(), brr = Arrays.stream(sc.nextLine().split("\\s")).mapToInt(i->Integer.parseInt(i)).toArray();
         int count = 0;
            
        if(arr[0]>=brr[0]){
            count++;
        }
            
        for(int i = 1 ; i<arr.length; i++){
            if((arr[i]-arr[i-1])>=brr[i]){
                count++;
            }
        }
            
        System.out.println(count);
        
    }

}

