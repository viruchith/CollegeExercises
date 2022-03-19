import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * Day02
 */


public class Day02v2 {

    public static List<Integer> generatePrimeList(int start,int end){
        List<Integer> prime = new ArrayList<Integer>(); 
        for (int i = start; i < end; i++) {
            boolean flag = false;
            for (int j = 2; j <= i / 2; j++) {
                if(i % j==0  ){
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                prime.add(i);
            }
        } 
        return prime;
    }

    public static List<List<Integer>> getAllCombintaions(int expectedSum,List<Integer> primeNumbersList){
        List<List<Integer>> allCombinations = new ArrayList<List<Integer>>();
        for (int i : primeNumbersList){
            for (int j : primeNumbersList ){
                for (int k : primeNumbersList ){
                    for (int l : primeNumbersList ){
                        if((i + j + k + l) == expectedSum){
                            ArrayList<Integer> combination = new ArrayList<Integer>();
                            Integer[] arr = {i,j,k,l};
                            Collections.addAll(combination,arr);
                            allCombinations.add(combination);
                        }
                    } 
                } 
            } 
        } 
        return allCombinations;
    }

    public static void main(String[] args) {
        int sum = 54, n = 4, p =4 ;
        List<List<Integer>> allCombinations =  getAllCombintaions(sum,generatePrimeList(p,sum));
        for (List<Integer> combination : allCombinations) {
            if(combination.size() == n){
                for (int num : combination) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }
    
}