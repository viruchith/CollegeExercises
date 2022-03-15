/*

Lucarnos Film Festival is an annual film festival and is also known for being a prestigious platform for art house films. Lucy, being a movie lover visits the Lucarnos Film Festival. There were many films screened in the show, of which Lucy somehow choose the best movie of her choice and set off to watch it.

The movie which Lucy chose to watch has N sequences. A sequence is defined as a series of scenes in a movie that form a distinct narrative unit. Lucy likes a sequence better if the sequence contains her favorite sequence in the movie as a substring.

Given the sequence and Lucy’c favorite sequence(F) check whether her favorite sequence is contained in the sequence.

Input Format

The first line of the input contains an integer N, which corresponds to the length of the sequence.

The second line of the input contains N space-separated integers, which corresponds to the sequence.

The third line of the input contains an integer n, which corresponds to the length of favorite sequence F.

The last line of the input contains n space-separated integers, which corresponds to the favorite sequence.

Constraints

None

Output Format

Print "Yes" (Without quotes)if the sequence contains Lucy’sfavourite sequence otherwise print "No" (Without quotes).

Sample Input 0

6
1 2 3 4 5 6
3
2 3 4

Sample Output 0

Yes

Sample Input 1

6
22 5 6 33 1 4
2
4 15

Sample Output 1

No


*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        sc.nextLine();
        
        int[] seq = Arrays.stream(sc.nextLine().split("\\s")).mapToInt(i->Integer.parseInt(i)).toArray();
        
        sc.nextLine();
        
        int[] favSeq = Arrays.stream(sc.nextLine().split("\\s")).mapToInt(i->Integer.parseInt(i)).toArray();
        
        int l = 0 , r = 0;
        
        boolean isPresent = false;
        
        while(l<seq.length){
            if(seq[l]==favSeq[r]){
                if(r==favSeq.length-1){
                    isPresent = true;
                    break;
                }else{
                  l++;r++;  
                }
            }else{
                if(r==0){
                    l++;
                }else{
                    r=0;
                }
            }
        }
        
        System.out.println((isPresent)?"Yes":"No");
    }
}

//-------------------------------------------------------------------------------------------------------------------------


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String seq = String.join( "" , sc.nextLine().split("\\s") );
        sc.nextLine();
        String favSeq = String.join( "" , sc.nextLine().split("\\s") );    
    
        System.out.println((seq.contains(favSeq))?"Yes":"No");
    }
}
