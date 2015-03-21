/////////////////////////////////////////////No of possible ways to climb//////////////////////////
import java.io.*;
import java.util.*;
class StairWays{
	public static void main(String args[]){
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[n];
		a[0]=1;
		a[1]=2;
		for(int i=2;i<n;i++){
			a[i]=a[i-1]+a[i-2];
		}
		System.out.println("No of ways to climb");
		for(int i=0;i<n;i++){
			System.out.println((i+1)+" "+a[i]);
		}
	}
}