public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String bin = Integer.toBinaryString(n);
        int count = 0;
        for(String c : bin.split("")){
            if(c.equals("1")){
                count++;
            }
        }
        return count;
    }
}





---------------------------------------------------------------------------------------------------------------------------
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            n = n & (n- 1);
            count++;
        }
        return count;
    }
}
