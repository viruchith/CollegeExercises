import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class UtilFunctions
{
    public static <T> Map<T,Long> countOccurences(List<T> list){
        return list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }
    
    public static <T> Map<T,Long> countOccurences(T[] array){
        return countOccurences(Arrays.asList(array));
    }
    
	public static void main(String[] args) {
		System.out.println(count("helloworld".split("")));
	}
}
