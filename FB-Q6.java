/*Find the minimum cost to reach destination using a train*/
import java.io.*;
import java.util.*;
class minimumcost{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int array[][]=new int[n][n];
		//assunming cost array is supplied i.e. array in this question is given
		int cost[]=new int[n];
		for(int i=0;i<n;i++){
			cost[i]=Integer.MAX_VALUE;
		}
		cost[0]=0;
		for(int i=1;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(cost[j]>cost[i]+cost[i][j]){
					cost[j]=cost[i]+cost[i][j];
				}
			}
		}
		System.out.println(cost[n-1]);

	}
}