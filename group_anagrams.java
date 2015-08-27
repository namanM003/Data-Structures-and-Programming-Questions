/*Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
Return:

[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]*/
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hm = new HashMap<String,ArrayList<String>>();
        List<List<String>> list = new ArrayList<List<String>>();
        char[] array;
        for(String str: strs ){
            array = str.toCharArray();
            Arrays.sort(array);
            String next = new String(array);
            if(hm.containsKey(next)){
                ArrayList temp = hm.get(next);
                temp.add(str);
                hm.put(next,temp);
            }
            else{
                ArrayList<String> temp = new ArrayList<String>();
                temp.add(str);
                hm.put(next,temp);
            }
        }
        Iterator itr= hm.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<String,ArrayList<String>> pair = (Map.Entry)itr.next();
            ArrayList<String> temp = pair.getValue();
            Collections.sort(temp);
            list.add(new ArrayList<String>(temp));
        }
        return list;
    }
}