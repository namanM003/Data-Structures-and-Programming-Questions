
/*******************Program to finding no of trailing zeroes for a given number factorial************/
import java.io.*;
import java.util.*;
class Solution {
    public static int trailingZeroes(int n) {
        int count5=0,z;
        //z=n%5;
        //n=n;
        for(int i=5;n/i>=1;i=i*5)
            count5+=n/i;
        return count5;
    }
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
    	int i=sc.nextInt();
    	System.out.ptintln(trailingZeroes(i));
    }
}