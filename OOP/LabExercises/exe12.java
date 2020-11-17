/*
Write a Java Program to read a file which contains numbers and find the minimum and maximum.

Sample Input:

data1.txt

Sample Output:

min = 1                                                                         

max = 1

Sample Input: (If it is empty file)

data2.txt

Sample Output:

Empty array                                                                     

min undefined                                                                   

max undefined

Note:

Use this SortedList class for work around with the numbers
*/

import java.io.*;
import java.util.*;

class SortedList
{

  ArrayList < Integer > array = null;

  SortedList ()
  {
    array = new ArrayList < Integer > ();
  }

  public void add (int x)
  {
    array.add (x);
    Collections.sort (array);
  }

  public boolean isEmpty ()
  {
    return array.isEmpty ();
  }

  public int getFirst ()
  {
    return array.get (0);
  }

  public int getLast ()
  {
    return array.get (array.size () - 1);
  }

}

class ReadFile
{
  public static void main (String[]args)
  {
    SortedList sl = new SortedList ();

      try
    {
      Scanner sc = new Scanner (System.in);
      String name = sc.next ();
      BufferedReader br = new BufferedReader (new FileReader (new File (name)));

      String s = "";

      while ((s = br.readLine ()) != null)
	{
	  sl.add (Integer.parseInt (s));

	}

      br.close ();
      if (sl.isEmpty ())
	{
	  System.out.println ("Empty array");
	  System.out.println ("min undefined");
	  System.out.println ("max undefined");

	}
      else
	{
	  System.out.println ("min = " + sl.getFirst ());
	  System.out.println ("max = " + sl.getLast ());
	}

    }
    catch (IOException ie)
    {

    }

  }
}
