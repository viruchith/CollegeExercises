import java.util.Deque;
import java.util.ArrayDeque;

class Tester {
    
    public static Deque<Integer> changeSmallest(Deque<Integer> inputStack) {
        //Implement your logic here and change the return statement accordingly
        Integer smallest = inputStack.peek();
        
        int smallestNumCount = 0;
        
        for(Integer num : inputStack){
            if(num<smallest){
                smallest = num;
                smallestNumCount = 0;
            }
            
            if(num==smallest){
                smallestNumCount++;
            }
        }
        
        while(true){
            boolean smallestNumExists = inputStack.remove(smallest);
            if(!smallestNumExists)
                break;
        }
        
        for(int i = 0; i<smallestNumCount;i++){
            inputStack.add(smallest);
        }
        
        return inputStack;
    }

    public static void main(String[] args) {
        
        Deque<Integer> inputStack = new ArrayDeque<Integer>();
        inputStack.push(10);
        inputStack.push(8);
        inputStack.push(5);
        inputStack.push(12);
        inputStack.push(5);
    
        Deque<Integer> updatedStack = changeSmallest(inputStack);
        
        System.out.println("Stack After Modification:");
        for (Integer value : updatedStack)
            System.out.println(value);
    }
}
