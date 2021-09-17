class Node{
    private String data;
    
    private Node leftNode,rightNode;
    
    public Node(String data){
        this.data = data;
    }
    
    public void setData(String data){
        this.data = data;
    }
    
    public String getData(String data){
        return this.data;
    }
    
    public void setLeftNode(Node node){
        this.leftNode = node;
    }
    
    public void setRightNode(Node node){
        this.rightNode = node;
    }
    
    public Node getLeftNode(){
        return this.leftNode;
    }
    
    public Node getRightNode(){
        return this.rightNode;
    }
    
    @Override
    public String toString(){
        return this.data;
    }
    
}

class BinaryTree{
    private Node rootNode;
    
    public BinaryTree(Node rootNode){
        this.rootNode = rootNode;
    }
    
    public Node getRootNode(){
        return this.rootNode;
    }
    
    public void preOrderTraversal(Node node){
        if(node!=null){
            System.out.println(node);
            this.preOrderTraversal(node.getLeftNode());
            this.preOrderTraversal(node.getRightNode());
        }
    }
    
    public void inOrderTraversal(Node node){
        if(node!=null){
            this.inOrderTraversal(node.getLeftNode());
            System.out.println(node);
            this.inOrderTraversal(node.getRightNode());
        }
    }
    
    public void postOrderTraversal(Node node){
        if(node!=null){
            this.postOrderTraversal(node.getLeftNode());
            this.postOrderTraversal(node.getRightNode());
            System.out.println(node);
        }
    }
    
    public void levelOrderTraversal(Node node){
        if(node!=null){
            if(node.getLeftNode()!=null){
                System.out.println(node.getLeftNode());
            }
            
            if(node.getRightNode()!=null){
                System.out.println(node.getRightNode());
            }
            
            levelOrderTraversal(node.getLeftNode());
            levelOrderTraversal(node.getRightNode());
        }
    }
}

public class Main
{
	public static void main(String[] args) {
	    Node rootNode = new Node("1");
	    rootNode.setLeftNode(new Node("2"));
	    rootNode.setRightNode(new Node("3"));
	    rootNode.getLeftNode().setLeftNode(new Node("4"));
	    rootNode.getLeftNode().setRightNode(new Node("5"));
	    rootNode.getRightNode().setLeftNode(new Node("6"));
	    rootNode.getRightNode().setRightNode(new Node("7"));
	    
	    BinaryTree bt = new BinaryTree(rootNode);
	    System.out.println(" PRE ORDER TRAVERSAL : ");
	    bt.preOrderTraversal(bt.getRootNode());
	    System.out.println("IN ORDER TRAVERSAL : ");
	    bt.inOrderTraversal(bt.getRootNode());
	    System.out.println("POST ORDER TRAVERSAL : ");
	    bt.postOrderTraversal(bt.getRootNode());
	    System.out.println("LEVEL ORDER TRAVERSAL : ");
	    System.out.println(bt.getRootNode());
	    bt.levelOrderTraversal(bt.getRootNode());
	}
}
