/*EDIT DISTANCE*/
import java.io.*;
import java.util.*;
class Edit_distance{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String str2=sc.nextLine();
	char[] array1=str.toCharArray();
	char[] array2=str2.toCharArray();
	int edit_array[][]=new int[array1.length+1][array2.length+1];
	for(int i=0;i<=array1.length;i++){
		edit_array[i][0]=i;
	}
	for(int i=0;i<=array2.length;i++){
		edit_array[0][i]=i;
	}
	int min=0;
	for(int i=1;i<=array1.length;i++){
		for(int j=1;j<=array2.length;j++){
			if(array1[i-1]==array2[j-1]){
				min=Math.min(edit_array[i-1][j-1],edit_array[i][j-1]);
				edit_array[i][j]=Math.min(min,edit_array[i-1][j]);
			}
			else{
				min=Math.min(edit_array[i-1][j-1],edit_array[i][j-1]);
				edit_array[i][j]=Math.min(min,edit_array[i-1][j])+1;
			}
		}
	}
	System.out.println(edit_array[array1.length][array2.length]);
}
}