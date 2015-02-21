///////////////Multiple of all elements in an array except its own////////
import java.io.*;
import java.util.*;
class multiply{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int array[]=new int[10];
		for(int i = 0;i<10;i++){
			array[i]=sc.nextInt();
		}
		int multiply[]=new int[10];
		multiply[0]=1;
		for(int i=1;i<10;i++){
			if(i==1){
				multiply[1]=array[0];
				continue;
			}
			multiply[i]=array[i-1]*multiply[i-1];
		}
		int multiplier=array[9];
		for(int i=8;i>=0;i--){
			multiply[i]=multiplier*multiply[i];
			multiplier*=array[i];
		}
		for(int i=0;i<10;i++){
			System.out.println(multiply[i]);
		}
	}
}