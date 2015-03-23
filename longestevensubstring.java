/*

Longest Even Length Substring such that Sum of First and Second Half is same
*/

import java.io.*;
import java.util.*;
class SubString{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char c[]=str.toCharArray();
		int maxlen=0,len=0,leftsum=0,rightsum=0,mid=0;
		int[][] sum=new int[c.length][c.length];
		for(int i=0;i<c.length;i++){
			sum[i][i]=c[i]-'0';
			//System.out.println(sum[i][i]);
		}
		for(int i=0;i<c.length;i++){
			for(int j=i+1;j<c.length;j++){
				len=j-i+1;
				if(len%2==0){
					mid=(i+j)/2;
					sum[i][j]=sum[i][j-1]+c[j]-'0';
					leftsum=sum[i][mid];
					rightsum=sum[i][j]-leftsum;
					//sum[i][j]=sum[i][j-1]+c[j]-'0';
					if(leftsum==rightsum){
						if(len>maxlen){
							maxlen=len;
						}
					}
				}
				else{
					sum[i][j]=sum[i][j-1]+c[j]-'0';
				}
			}
		}
		System.out.println(maxlen);
	}
}