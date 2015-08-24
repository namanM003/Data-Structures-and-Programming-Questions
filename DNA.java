/* All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.

Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.

For example,

Given s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",

Return:
["AAAAACCCCC", "CCCCCAAAAA"].
*/
public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> hs = new HashSet<String>();
        List<String>  list = new ArrayList<String>();
        String str;
        for(int i=0;i<=s.length()-10;i++){
            str = s.substring(i,i+10);
            if(hs.contains(str)){
                if(list.contains(str)){
                    continue;
                }
                else{
                    list.add(str);
                }
            }
            else{
                hs.add(str);
            }
        }
        return list;
    }
}