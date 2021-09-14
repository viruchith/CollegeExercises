class Node{
    private Node next,prev;
    private String data;
    
    Node(String data){
        this.data = data;
    }
    
    public void setNext(Node next){
        this.next = next;
    }
    
    public void setPrev(Node prev){
        this.prev = prev;
    }
    
    public Node getNext(){
        return this.next;
    }
    
    public Node getPrev(){
        return this.prev;
    }
    
    public void setData(String data){
        this.data = data;
    }
    
    public String getData(){
        return this.data;
    }
    
    @Override
    public String toString(){
        return this.data;
    }
    
}


class DoublyLinkedList{
    private Node head,tail;
    private int size;
    
    DoublyLinkedList(){
        this.size = 0;
    }
    
    public Node getHead(){
        return this.head;
    }
    
    public Node getTail(){
        return this.tail;
    }
    
    public int getSize(){
        return this.size;
    }
    
    public boolean isEmpty(){
        return (this.size<=0)?true:false;
    }
    
    public void displayForward(){
        Node node = this.head;
        while(node!=null){
            System.out.println(node);
            node = node.getNext();
        }
    }
    
    public void displayBackward(){
        Node node = this.tail;
        while(node!=null){
            System.out.println(node);
            node = node.getPrev();
        }
    }
    
    public void insertAtTheBeginning(String data){
        Node node = new Node(data);
        if(this.isEmpty()){
            this.head = this.tail = node;
        }else{
            this.head.setPrev(node);
            node.setNext(this.head);
            this.head = node;
        }
        this.size++;
    }
    
    public void insertAtTheEnd(String data){
        Node node = new Node(data);
        if(this.isEmpty()){
            this.head = this.tail = node;
        }else{
            node.setPrev(this.tail);
            this.tail.setNext(node);
            this.tail = node;
        }
        this.size++;
    }
    
    public Node find(String data){
        Node node = this.head;
        while(node!=null){
            if(node.getData().equals(data)){
                return node;
            }
            node = node.getNext();
        }
        return node;
    }
    
    public void insertAfter(String dataBefore,String data){
        Node nodeBefore = this.find(dataBefore);
        if(nodeBefore == null){
            System.out.println("dataBefore does not exist !");
        }else{
            if(nodeBefore.equals(this.tail)){
                this.insertAtTheEnd(data);
            }else{
                Node node = new Node(data);
                node.setPrev(nodeBefore.getPrev());
                node.setNext(nodeBefore.getNext());
                nodeBefore.setNext(node);
            }
            this.size++;
        }
        
    }
    
    public void insertBefore(String dataAfter , String data){
        Node nodeAfter = this.find(dataAfter);
        if(nodeAfter == null){
            System.out.println("dataAfter does not exist !");
        }else{
            if(nodeAfter.equals(head)){
                insertAtTheBeginning(data);
            }else{
                Node node = new Node(data);
                node.setNext(nodeAfter);
                node.setPrev(nodeAfter.getPrev());
                nodeAfter.getPrev().setNext(node);
            }
        }
    }
    
    public void deleteFirst(){
        if(this.isEmpty()){
            System.out.println("List is Empty !");
        }else{
            if(this.size==1){
                this.head = this.tail = null;
            }else{
                Node nodeAfter = this.head.getNext();
                this.head = nodeAfter;
            }
            this.size--;
        }
    }
    
    
    
}

public class Main{
    public static void main (String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtTheBeginning("Blue");
        dll.insertAtTheBeginning("Green");
        dll.insertAtTheBeginning("Red");
        dll.insertAtTheEnd("Yellow");
        dll.insertAfter("Yellow","Black");
        dll.insertBefore("Red","Maroon");
        dll.displayForward();
    }
}
