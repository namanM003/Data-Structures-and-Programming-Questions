/*NUMBER SERIES*/
import java.util.*;
class series{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Min Number: ");
		long min = sc.nextLong();
		System.out.println("Enter Max Number ");
		long max = sc.nextLong();
		long previous = 1;
		long pprevious = 1;
		long current_start = 1;
		long next = 0;
		StringBuilder strb = new StringBuilder();
		strb = strb.append("" + Long.toString(previous)+""+Long.toString(pprevious));
		while(Long.parseLong(strb.toString())<=max){
			if(Long.parseLong(strb.toString()) >=min){
				System.out.println(strb.toString());
			}
			next = previous+pprevious;
			pprevious = previous;
			previous = next;
			strb = strb.append(next);
			if(Long.parseLong(strb.toString())>max){
				current_start++;
				previous = current_start;
				pprevious = current_start;
				strb = new StringBuilder();
				strb = strb.append(Long.toString(pprevious)+Long.toString(previous));
			}
		}
	}
}