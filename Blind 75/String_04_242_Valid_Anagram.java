class Solution {
    public boolean isAnagram(String s, String t) {
        Map<String,Integer> map1 = new HashMap<String,Integer>();
        Map<String,Integer> map2 = new HashMap<String,Integer>();

        for(String c : s.split("")){
            if(map1.containsKey(c)){
                map1.put(c,map1.get(c)+1);
            }else{
                map1.put(c,1);
            }
        }
        
        for(String c : t.split("")){
            if(map2.containsKey(c)){
                map2.put(c,map2.get(c)+1);
            }else{
                map2.put(c,1);
            }
        }
        return map1.equals(map2);
    }
}

--------------------------------------------------------------------------------------------------------------------------

class Solution {
    public boolean isAnagram(String s, String t) {
        List<String> list1  = Arrays.asList(s.split(""));
        List<String> list2  = Arrays.asList(t.split(""));

        Collections.sort(list1);
        Collections.sort(list2);
        
        
        
        return list1.equals(list2);
    }
}
