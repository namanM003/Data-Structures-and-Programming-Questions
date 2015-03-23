/*

Count number of ways to reach a given score in a game

*/
import java.io.*;
import java.util.*;
class PossibleWays{
	static int given_no[];
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int[] no={2,3,5};
		int n=sc.nextInt();
		given_no=new int[n+1];
		for(int i=0;i<no.length;i++){
			for(int j=0;j<given_no.length;j++){
				if(j-no[i]>=0){
					if(j-no[i]==0){
						given_no[j]++;
					}
					else{
						given_no[j]+=given_no[j-no[i]];
					}
				}
			}
		}
		System.out.println(given_no[n]);

	}
}