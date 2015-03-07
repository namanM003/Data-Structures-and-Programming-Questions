import java.io.*;
import java.util.*;
class Fractal{
	static int a[][];
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		a=new int[(int)Math.pow(3,n-1)][(int)Math.pow(3,n-1)];
		fractal(n);
        for(int i = 0 ; i < (int)Math.pow(3,n-1) ; i++)
	       {
	       	for(int j = 0 ; j < (int)Math.pow(3,n-1) ; j++)
	       	 if(a[i][j]==1)
	       		System.out.print('X');
	       	 else
	       	  	System.out.print(" ");
	       	System.out.println();
	       }
	} 

    static void replicate(int x,int y,int n)
    {
        for(int i = 0 , k = x; i < (int)Math.pow(3,n-2) ; i++ , k++)
           for(int j  = 0 ,l = y; j < (int)Math.pow(3,n-2) ; j++ , l++)
           	  a[k][l]  = a[i][j];
    }


	static void fractal(int n)
	{  if(n == 1)
         {
           a[0][0] = 1;
            return;
         }


      fractal(n-1);
      replicate((int)Math.pow(3,n-2),(int)Math.pow(3,n-2),n);
      replicate((int)Math.pow(3,n-2)+(int)Math.pow(3,n-2),(int)Math.pow(3,n-2)+(int)Math.pow(3,n-2),n);
      replicate((int)Math.pow(3,n-2)-(int)Math.pow(3,n-2),(int)Math.pow(3,n-2)+(int)Math.pow(3,n-2),n);
      replicate((int)Math.pow(3,n-2)+(int)Math.pow(3,n-2),(int)Math.pow(3,n-2)-(int)Math.pow(3,n-2),n);
	}
}