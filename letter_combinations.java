/*Letter Combinations of a Phone Number 

Given a digit string, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.

Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
*/
public class Solution {
    String[] c = new String[8];

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return new ArrayList<String>();
        }
        c[0] = "abc";
        c[1] = "def";
        c[2] = "ghi";
        c[3] = "jkl";
        c[4] = "mno";
        c[5] = "pqrs";
        c[6] = "tuv";
        c[7] = "wxyz";
        char[] array = digits.toCharArray();
        int[] numbers = new int[array.length];
        for(int i=0;i<array.length;i++){
            numbers[i]=Character.getNumericValue(array[i]);
        }
        int index = 0;
        List<String> list = new ArrayList<String>();
        return findCombinations(numbers,list,"",0);
    }
    public List<String> findCombinations(int[] numbers,List<String> list,String str,int index){
        if(index == numbers.length){
            list.add(str);
            return list;
        }
        else{
            for(int i=0;i<c[numbers[index]-2].length();i++){
               findCombinations(numbers,list,str+c[numbers[index]-2].charAt(i),index+1);
            }
        }
        return list;
    }
}