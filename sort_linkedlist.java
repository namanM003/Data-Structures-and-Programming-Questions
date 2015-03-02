//////////////////////Sorting a linked List//////////////////////
import java.io.*;
//import java.util.*;
class LinkedList{
	int val;
	LinkedList next;
	public LinkedList(int x){
		val=x;
		next=null;
	}
	public LinkedList(){
		val=-1;
		next=null;
	}
}
class LinkedListSort{
	public static void main(String args[]){
		LinkedList[] ll=new LinkedList[10];
		LinkedList head,temp;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++){
			LinkedList l=new LinkedList();
			l.val=sc.nextInt();
			if(i==0){
				head=l;
			}
			else{
				temp=head;
				while(temp.next!=null){
					temp=temp.next;
				}
				temp.next=l;
			}
		}
		sort(head);
	}
	public static void sort(LinkedList head){
		int count=0;
		LinkedList temp;
		LinkedList before_pointer,after_pointer,after_pointer1,before_pointer1;
		while(temp.next!=null){
			count++;
		}
		while(count>=0){
			
		}
	}
}