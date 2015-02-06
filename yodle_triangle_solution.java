import java.io.*;
import java.util.*;
class yodle_triangle_solution{
	public static void main(String args[]) throws IOException{
		File f=new File("triangle.txt");	//Read Input File		
		BufferedReader br=new BufferedReader(new FileReader(f));
		int sum=0;
		String str,str2;
		String arr[],arr2[];
		int val=0;
		str=br.readLine();		//Read First line from triangle.txt
		arr2=str.split(" ");
		arr=str.split(" ");
		int i,x,y;
		while((str2=br.readLine())!=null){ 
			arr2=str2.split(" ");
			arr2[0]=""+(Integer.parseInt(arr2[0])+Integer.parseInt(arr[0]));		//Make first element of the line sum of first element and first element of previous line.
			arr2[arr2.length-1]=""+(Integer.parseInt(arr2[arr2.length-1])+Integer.parseInt(arr[arr.length-1]));	//Make last element of the line sum of last element and last element of previous line
			for(i=1;i<arr2.length-1;i++){
				//for second element onwards check which is bigger sum of element at index and sum of elemment at index-1 in previous line or sum of element at index of previous line
				x=Integer.parseInt(arr2[i])+Integer.parseInt(arr[i-1]);	
				y=Integer.parseInt(arr2[i])+Integer.parseInt(arr[i]);
				//Replacing element in line with the bigger sum;
				if(x>y){
					arr2[i]=""+x;
				}
				else{
					arr2[i]=""+y;
				}

			}
			arr=arr2;
		}
		sum=0;
		//Find the biggest no in last line.
		for(i=0;i<arr2.length;i++)
		{
			x=Integer.parseInt(arr2[i]);
			if(sum<x)
				sum=x;
		}
		System.out.println(sum);
	}
}
