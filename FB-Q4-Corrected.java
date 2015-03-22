/* Facebook Interview Question for Software Engineers

    facebook-interview-questions
    0
    of 0 votes
    50
    Answers

    Question: Given a sequence of positive integers A and an integer T, return whether there is a continuous sequence of A that sums up to exactly T
    Example
    [23, 5, 4, 7, 2, 11], 20. Return True because 7 + 2 + 11 = 20
    [1, 3, 5, 23, 2], 8. Return True because 3 + 5 = 8
    [1, 3, 5, 23, 2], 7 Return False because no sequence in this array adds up to 7*/

    import java.io.*;
    import java.util.*;
    class Valid_sum{
    	public static void main(String args[]){
    		int n;
    		Scanner sc=new Scanner(System.in);
    		n=sc.nextInt();
    		int array[]=new int[n];
    		System.out.println("Enter "+n+" elements");
    		for(int i=0;i<n;i++){
    			array[i]=sc.nextInt();
    		}
    		int x;
    		x=sc.nextInt();
    		System.out.println(is_sum_present(array,x));
    	}
    	public static boolean is_sum_present(int[] array,int x){
    		int sum=0,index=0;
            for(int i=0;i<array.length;i++){
                while(sum<x && index<array.length){
                    sum+=array[index];
                    index++;
                }
                if(sum==x){
                    return true;
                }
                sum-=array[i];

            }
            return false;
    	}
    }