/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
    Scanner sc=new Scanner(System.in);
    int T,N;
    long array[][],K,profit=0,max=0,x;//=new int[N][2];
    T=sc.nextInt();
    for(int j=0;j<T;j++){
    N=sc.nextInt();
   // System.out.println("N ="+N);
    K=sc.nextLong();
   // System.out.println("K ="+K);
    array=new long[N][2];
    for(int i=0;i<N;i++){
        array[i][0]=sc.nextLong();
        //System.out.println("array[i][0] ="+array[i][0]);
    }
    for(int i=0;i<N;i++){
        array[i][1]=sc.nextLong();
    }
    for(int i=0;i<N;i++){
        x=(long)(K/array[i][0]);
        profit=array[i][1]*x;
        //System.out.println("profit "+profit);
        if(profit>max)
            max=profit; 
    }
    System.out.println(max); 
    }
}
	}

