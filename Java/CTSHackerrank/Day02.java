import java.util.ArrayList;
import java.util.List;

/**
 * Day02
 */


public class Day02 {

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

    public static void generateCombinationList(int startIndex,List<Integer> primeNumbersList,int expectedSum,List<List<Integer>> allCombinations,List<Integer> combination){
        if (startIndex == primeNumbersList.size()) {
            if (expectedSum == 0) {
                //System.out.println("Actual : "+combination);
                allCombinations.add(new ArrayList<>(combination));
            }
            return;
        }

        int primeNum = primeNumbersList.get(startIndex);

        if ( primeNum<= expectedSum ) {
            combination.add(primeNum);
            generateCombinationList(startIndex+1, primeNumbersList, (expectedSum-primeNum), allCombinations, combination);
            //System.out.println("Combination BE : "+combination+" sum = "+expectedSum);
            combination.remove(combination.size()-1);
            //System.out.println("Combination AF : "+combination+" sum = "+expectedSum);

        }
        //System.out.println("Combination "+combination+" Outer sum = "+expectedSum);
        generateCombinationList(startIndex+1, primeNumbersList, expectedSum, allCombinations, combination);
    }

    public static List<List<Integer>> getAllCombintaions(int expectedSum,List<Integer> primeNumbersList){
        List<List<Integer>> allCombinations = new ArrayList<List<Integer>>(); //overall list
        generateCombinationList(0,primeNumbersList, expectedSum, allCombinations, new ArrayList<Integer>());
        return allCombinations;
    }

    public static void main(String[] args) {
        int sum = 54, n = 4, p =4 ;
        // 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53
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