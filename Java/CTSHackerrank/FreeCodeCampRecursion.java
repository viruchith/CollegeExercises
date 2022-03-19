public class FreeCodeCampRecursion {
    public static String reverseString(String string){
        if(string.equals("")){
            return string;
        }
        return reverseString(string.substring(1)) + string.charAt(0);
    }

    public static boolean isAPalindrome(String string){
        if(string.length() == 0 || string.length() == 1){
            return true;
        }

        if(string.charAt(0) == string.charAt(string.length()-1)){
            return isAPalindrome(string.substring(1, string.length()-1));
        }
        return false;
    }

    public static String decimalToBinary(int decimal,String result){
        if(decimal==0){
            return result;
        }
        result = decimal % 2 + result;
        return decimalToBinary(decimal  / 2, result);
    }

    public static int naturalSum(int num){
        if (num<=1) {
            return num;
        }
        return num + naturalSum(num-1);
    }

    public static int binarySearch(int[] array, int low,int high,int target){
        if(low > high){
            return -1;
        }

        int mid = (low + high) / 2;

        if(target == array[mid]){
            return mid;
        }

        if(target < array[mid]){
            return binarySearch(array, low, mid-1, target);
        }

        return binarySearch(array, mid+1, high, target);
    }
    
    public static int fibonacci(int n){
        if(n == 0 || n==1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println("Reverse 'Hello' : "+reverseString("hello"));
        System.out.println("Palindrome 'racecar' : "+isAPalindrome("racecar"));
        System.out.println("Decimal To Binary 192 : "+decimalToBinary(192,""));
        System.out.println("Natural Sum : "+naturalSum(10));
        System.out.println("Find 8 : "+binarySearch(new int[]{1,2,3,4,5,6,7,8,9,10}, 0, 9,8));
        System.out.println("Fibonacci : "+fibonacci(8));
    }
}
