/*Longest Substring Without Repeating Characters*/
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        int start = 0;
        int end = 0;
        int length=0;
        char[] strtoarr = s.toCharArray();
        //boolean flag = true;
        int i=0;
        int value=0;
        for(i=0;i<strtoarr.length;i++){
            if(hm.containsKey(strtoarr[i]) && (value=hm.get(strtoarr[i]))>=start && (value=hm.get(strtoarr[i]))<i){
                if(length<i-start){
                    length = i-start;
                }
                start = hm.get(strtoarr[i])+1;
                hm.put(strtoarr[i],i);
            }
            else{
                if(hm.containsKey(strtoarr[i])){
                    hm.put(strtoarr[i],i);
                }
                else{
                    hm.put(strtoarr[i],i);
                }
            }
        }
        if(/*start==0 &&*/ length < i-start){
            length = i-start;
        }
        return length;

        }
        
}
