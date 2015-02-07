import java.io.*;
import java.util.*;
class numbertostring{
	public static void main(String args[]){
		String one[]={""," one"," two"," three"," four"," five"," six"," seven"," eight"," nine"};
		String exceptions[]={" ten"," eleven"," twelve"," thirteen"," fourteen"," fifteen"," sixteen"," seventeen"," eighteen"," ninteen"};
		String word[]={"",""," twenty"," thirty"," fourty"," fifty"," sixty"," seventy"," eighty"," ninety"};
		String finalw[]={" hundred"," thousand"," lac"," crore"};
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		String s="";
		int level=0;
		int finall=0;
		int mod;
		while(i!=0){
			mod=i%10;
			i=i/10;
			if(level==0 && i!=0){
				int mod2=i%10;
				if(mod2==1){
					i=i/10;
					s=exceptions[mod];
					level+=2;
					continue;
				}
			}
			if(level==1){
				s=word[mod]+s;
			}
			if(level==0){
				s=one[mod]+s;
			}
			//System.out.println("Mod Value "+mod);
			if(level>=2){
				String temp="";
				if(i!=0 && level!=2){
					int mod2=i%10;
					temp=word[mod2]+one[mod];
					level++;
					i=i/10;
					if(mod2==1){
						temp="";
						temp=exceptions[mod];
					}
				}
				else{
					temp=one[mod];
				}
				//if(!one[mod].equals(""))
					s=temp+finalw[finall]+s;
				finall++;
			}
			level++;
		}
		System.out.println(s);
	}
}