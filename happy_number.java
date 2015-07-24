/*Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 19 is a happy number

    12 + 92 = 82
    82 + 22 = 68
    62 + 82 = 100
    12 + 02 + 02 = 1
*/
    public boolean isHappy(int n) {
        int number = n;
        int next_number = 0;
        int[] power = new int[]{0,1,4,9,16,25,36,49,64,81};
        int rem = 0;
        HashSet<Integer> hs = new HashSet<Integer>();
        while(n!=1){
            hs.add(number);
            while(number!=0){
                rem = number%10;
                next_number += power[rem];
                number = number/10;
            }
            if(next_number == 1){
                return true;
            }
            else{
                number = next_number;
                next_number = 0;
            }
            if(hs.contains(number))
                return false;
        }
        return true;
    }
}