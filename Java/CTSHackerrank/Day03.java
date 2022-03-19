import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class BSTNode{
    private int data;
    private BSTNode leftNode,rightNode;

    
    public BSTNode() {
    }

    public BSTNode(int data) {
        this.data = data;
    }

    public BSTNode(int data, BSTNode leftNode, BSTNode rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }


    public static BSTNode insert(BSTNode root , int data){
        if(root == null){
            root = new BSTNode();
            root.setData(data);
        }else{
            if(data < root.getData()){
                root.setLeftNode(BSTNode.insert(root.getLeftNode(), data));
            }else if (data > root.getData()){
                root.setRightNode(BSTNode.insert(root.getRightNode(), data));
            }
        }
        return root;
    }

    public static List<List<Integer>> levelOrderTraversal(BSTNode root){
        List<List<Integer>> levels = new ArrayList<>();
        if(root == null){
            return levels;
        }

        Queue<BSTNode> queue = new LinkedList<BSTNode>();

        queue.offer(root);
        queue.offer(null); // to prevent the queue from becoming empty
        
        List<Integer> currentLevels = new ArrayList<Integer>();

        while(!queue.isEmpty()){
            BSTNode tmp = queue.poll();
            if (tmp!=null) {
                currentLevels.add(tmp.getData());
                if (tmp.getLeftNode()!=null) {
                    queue.offer(tmp.getLeftNode());
                }
                if (tmp.getRightNode()!=null) {
                    queue.offer(tmp.getRightNode());
                }
            } else {
                List<Integer> currentLevelsCopy = new ArrayList<>(currentLevels);
                levels.add(currentLevelsCopy);
                currentLevels.clear();

                if(!queue.isEmpty()){
                    queue.offer(null);//to mark end of level
                }
            }
        }
        return levels;
    }

    public BSTNode getLeftNode() {
        return leftNode;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public BSTNode getRightNode() {
        return rightNode;
    }
    public void setRightNode(BSTNode rightNode) {
        this.rightNode = rightNode;
    }
    public void setLeftNode(BSTNode leftNode) {
        this.leftNode = leftNode;
    }
    @Override
    public String toString() {
        return "BSTNode [data=" + data + "]";
    }

}

public class Day03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        //int data[] = {21, 18, 14, 17, 45, 38, 2, 87, 11};
        // 21 18 14 17 45 38 2 87 11
        int[] data = new int[T];
        for (int i = 0; i < data.length; i++) {
            data[i] = sc.nextInt();
        }

        BSTNode root = null;
        for (int num : data) {
            root = BSTNode.insert(root, num);
        }
        List<List<Integer>> levels =  BSTNode.levelOrderTraversal(root);
        for (List<Integer> level : levels) {
            for (Integer num : level) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
