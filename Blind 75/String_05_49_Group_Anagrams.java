class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = Arrays.stream(strs).collect(Collectors.groupingBy((str)->{
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            return String.valueOf(charArr);
        }));
        
                
        return new ArrayList<List<String>>(map.values());
    }
}


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = Arrays.stream(strs).collect(Collectors.groupingBy((str)->{
            String[] strArr = str.split("");
            Arrays.sort(strArr);
            return String.join("",strArr);
        }));
        
        
        return new ArrayList<List<String>>(map.values());
    }
}

