/************Program for keeping elements sorted in a stack*****************/
import java.util.*;
import java.io.*;
class stacks{
	public static void main(String args[]){

		Stack<Integer> s1=new Stack<Integer>();
		Stack<Integer> s2=new Stack<Integer>();
		Scanner sc=new Scanner(System.in);
		int i=Integer.parseInt(sc.nextLine());
		for(int j=0;j<i;j++){
			int x=sc.nextInt();
			s1.push(x);
		}
		int j;
		while(s1.isEmpty()!=true){
			j=s1.pop();
			if(s2.isEmpty()==true){
				s2.push(j);
			}
			else{
				if(s2.peek()<j){
					s2.push(j);
				}
				else{
					while(s2.isEmpty()!=true && s2.peek()>j ){
						s1.push(s2.pop());
					}
					s2.push(j);
				}
			}
		}
		int y=s2.size();
		for(int x=0;x<y;x++){
			System.out.println(s2.pop()+"\t");
		}

	
	}
}