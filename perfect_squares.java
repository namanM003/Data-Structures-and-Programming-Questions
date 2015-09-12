/*
Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, return 2 because 13 = 4 + 9.*/
public class Solution {
    public int numSquares(int n) {
        int[] square_root = new int[(int)Math.sqrt(n)];
        for(int i=0;i<square_root.length;i++)
            square_root[i] = (i+1)*(i+1);
        int[] numbers = new int[n+1];
        Arrays.fill(numbers,0);
        numbers[0] = 0;
        //Arrays.fill
        int min = 0;
        for(int i=1;i<=n;i++){
            min = Integer.MAX_VALUE-1;
            for(int j:square_root){
                if(i-j>=0){
                    min = Math.min(numbers[i-j],min);
                }
                else{
                    break;
                }
            }
            numbers[i] = min+1;
        }
        return numbers[n];
    }
}