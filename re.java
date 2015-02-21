/*Given a regular expression with characters a-z, ' * ', ' . ' the task was to find if that string could match another string with characters from: a-z where ' * ' can delete the character before it, and ' . ' could match whatever character. ' * ' always appear after a a-z character.*/
/////////////////////////Program to validate two strings///////////////////////


import java.io.*;
import java.util.*;
class RE{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		boolean res=match(s1,s2);
		if(res){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}
	public static boolean match(String s1, String s2){
		if(0==s1.length() && 0==s2.length()){
			return true;
		}
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		int len1=a.length-1,len2=b.length-1;
		if( b[len2]!='*' && b[len2]!='.'){
			if(a[len1]==b[len2]){
				return match(s1.substring(0,len1),s2.substring(0,len2));
			}
			else{
				return false;
			}
		}
		if(b[len2]=='*'){
			int count=0,i=0,count2=0;
			
			while(b[len2-i-1]==b[len2-2-i]){
					count++;
					i++;
			}
			i=0;
			while(-1!=len1-i-1 && a[len1-i]==a[len1-i-1]){
				count2++;
				i++;
			}
			System.out.println(count+" "+count2);
			return match(s1.substring(0,len1-count2+count),s2.substring(0,len2-1));
		}
		if(b[len2]=='.'){
			return match(s1.substring(0,len1-1),s2.substring(0,len2-1));
		}
		return true;
	}
}