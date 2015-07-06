public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        if(n==-2147483648)
        {
            return false;
        }
        int x = n-1;
        int z = x & n;
        if(z == 0){
            return true;
        }
        return false;
    }
}