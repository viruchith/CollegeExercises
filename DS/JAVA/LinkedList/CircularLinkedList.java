class Node
{
  private Node next;
  private String data;

 public Node (String data)
  {
    this.data = data;
  }

  public void setNext (Node next)
  {
    this.next = next;
  }


  public Node getNext ()
  {
    return this.next;
  }



  public void setData (String data)
  {
    this.data = data;
  }

  public String getData ()
  {
    return this.data;
  }

  @Override public String toString ()
  {
    return this.data;
  }

}


class CircularLinkedList
{
  private Node head, tail;
  private int size;

  public CircularLinkedList ()
  {
    this.size = 0;
  }

  public void insertAtTheBeginning (String data)
  {
    Node node = new Node (data);
    if (this.head == null)
      {
	node.setNext (node);
	this.head = this.tail = node;
      }
    else
      {
	node.setNext (this.head);
	this.tail.setNext (node);
	this.head = node;
      }
    this.size++;
  }

  public void insertAtTheEnd (String data)
  {
    Node node = new Node (data);
    if (this.head == null)
      {
	node.setNext (node);
	this.head = this.tail = node;
      }
    else
      {
	node.setNext (this.head);
	this.tail.setNext (node);
	this.tail = node;
      }
    this.size++;
  }

  public void deleteFirst ()
  {
    if (this.isEmpty ())
      {
	System.out.println ("List is Empty !");
      }
    else
      {
	if (this.size == 1)
	  {
	    this.head = this.tail = null;
	  }
	else
	  {
	    this.tail.setNext (this.head.getNext ());
	    this.head = this.head.getNext ();

	  }
      }
  }

  public void deleteLast ()
  {
    if (this.isEmpty ())
      {
	System.out.println ("List is Empty !");
      }
    else
      {
	if (this.size == 1)
	  {
	    this.head = this.tail = null;
	  }
	else
	  {
	    Node nodeBefore, node;
	    node = this.head;
	    while (node.getNext ().equals (this.tail) == false)
	      {
		node = node.getNext ();
	      }
	    nodeBefore = node;
	    nodeBefore.setNext (this.head);
	    this.tail = nodeBefore;
	  }
      }
  }


  public void display ()
  {
    Node node = this.head;
    do
      {
	System.out.println (node);
	node = node.getNext ();
      }
    while (!node.equals (head));
  }

  public boolean isEmpty ()
  {
    return (this.size <= 0);
  }

  public int size ()
  {
    return this.size;
  }

  public Node getHead ()
  {
    return this.head;
  }

  public Node getTail ()
  {
    return this.tail;
  }


}

public class Main
{
  public static void main (String[]args)
  {
    CircularLinkedList cll = new CircularLinkedList ();
      cll.insertAtTheEnd ("P");
      cll.insertAtTheBeginning ("R");
      cll.insertAtTheBeginning ("G");
      cll.insertAtTheBeginning ("B");
      cll.insertAtTheEnd ("Q");
      cll.deleteLast ();
      cll.display ();

      System.out.println (cll.size ());
  }
}
