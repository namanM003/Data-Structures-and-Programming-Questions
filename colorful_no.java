/*Check whether a number is a colorful number or not*/
import java.util.*;
class Solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No: ");
		int x = sc.nextInt();
		HashSet<Integer> hs = new HashSet<Integer>();
		String s = ""+x;
		char[] no = s.toCharArray();
		//int start = 0;
		int number = 1;
		int start = 0;
		for(int i=0;i<no.length;i++){
			start = i;
			number = 1;
			for(int j=i;j<no.length;j++){
				//number = 1;
				if(i==0 && j==no.length-1){
					continue;
				}
				while(start<=j){
					number = number*Character.getNumericValue(no[start]);
					start++;
				}
				if(hs.contains(number)){
					//System.out.println(number);
					System.out.println("FALSE");
					return;
				}
				else{
					//System.out.println(number);
					hs.add(number);
				}
			}
		}
		System.out.println("TRUE");
	}
}