import java.util.*;
class Main {
	// Prints the array
    
    public static <T> List<T[]> heapPermutations(T[] arr){
        List<T[]> permutations = new ArrayList<T[]>();
        
        generateHeapPermutations(permutations,arr.length,Arrays.copyOf(arr,arr.length));
        
        return permutations;
    }
    
    private static <T> void generateHeapPermutations(List<T[]> permutations,int n,T[] arr){
        if(n==1){
            permutations.add(Arrays.copyOf(arr,arr.length));
            return;
        }
        
        generateHeapPermutations(permutations,n-1,arr);
        
        boolean isEven = (n % 2 == 0) ? true : false;
        
        if(isEven){
            for (int i = 0; i < n-1 ;i++ ){
                swapInPlace(arr,i,n-1);
                generateHeapPermutations(permutations,n-1,arr);
            } 
        }else{
            for (int i = 0; i < n-1 ;i++ ){
                swapInPlace(arr,0,n-1);
                generateHeapPermutations(permutations,n-1,arr);
            }
        }
        
    }
    
    private static <T> void swapInPlace(T[] arr,int index1,int index2){
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
	public static void main(String args[])
	{
		Main obj = new Main();
		Integer a[] = { 1, 2, 3};
		for(Integer[] arr : heapPermutations(a)){
		    System.out.println(Arrays.toString(arr));
		}
		
		// Output
		/*
		[1, 2, 3]
        [2, 1, 3]
        [3, 1, 2]
        [1, 3, 2]
        [2, 3, 1]
        [3, 2, 1]

		
		*/
	}
}


