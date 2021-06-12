/*
Merge a given queue of integers and a queue of alphabets to form a single queue based on the below mentioned rules:

Merge elements at the same position starting with the integer queue.

If one of the queues has more elements than the other, add all the additional elements at the end of the output queue.

Implement the logic inside mergeQueue() method.

Test the functionalities using the main() method of the Tester class.

*/

import java.util.Deque;
import java.util.ArrayDeque;

class Tester {
    
    public static Deque<Object> mergeQueue(Deque<Integer> intQueue, Deque<Character> charQueue) {
		//Implement your logic here and change the return statement accordingly 
		Deque<Object> mergedQueue = new ArrayDeque<Object>();
		int count = (charQueue.size()>intQueue.size())?charQueue.size():intQueue.size();
		while(count>0){
		    if(intQueue.peek()!=null){
		        mergedQueue.add(intQueue.poll());
		    }
		    
		    if(charQueue.peek()!=null){
		        mergedQueue.add(charQueue.poll());
		    }
		    
		    count--;
		}
		return mergedQueue;
	}

	public static void main(String[] args) {
		
		Deque<Integer> integerQueue = new ArrayDeque<Integer>();
		integerQueue.add(3);
		integerQueue.add(6);
		integerQueue.add(9);
		
		Deque<Character> characterQueue = new ArrayDeque<Character>();
        characterQueue.add('a');
		characterQueue.add('e');
		characterQueue.add('i');
		characterQueue.add('o');
		characterQueue.add('u');
		characterQueue.add('b');
		
		Deque<Object> mergedQueue = mergeQueue(integerQueue, characterQueue);
		
		System.out.println("The elements in the merged queue are:");
		for(Object element: mergedQueue)
		    System.out.println(element);
	    
	}
}
