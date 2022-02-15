import java.util.*;

class Main {
    public static List<String> heapPermutations(String str){
        List<String> permutations = new ArrayList<>();
        generateHeapPermutations(permutations,str.toCharArray(),str.length());
        return permutations;
    }
    
    public static void generateHeapPermutations(List<String> permutations,char[] arr,int n){
        if(n == 1){
            permutations.add(String.valueOf(arr));
            return;
        }
        
        generateHeapPermutations(permutations,arr,n-1);
        
        boolean isEven = (n % 2 == 0);
        
        if(isEven){
            for(int i = 0 ; i<n-1 ; i++){
               swapInPlace(arr,i,n-1);
               generateHeapPermutations(permutations,arr,n-1);
            }
        }else{
            for(int i = 0 ; i<n-1 ; i++){
               swapInPlace(arr,0,n-1);
               generateHeapPermutations(permutations,arr,n-1);
            }
        }
    }
    
    public static void swapInPlace(char[] arr,int index1,int index2){
        char temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
    public static void main(String args[])
    {
         String s = "abcd";
         
         System.out.println(heapPermutations(s));
    }
}


