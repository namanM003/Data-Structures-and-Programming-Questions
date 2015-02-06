import java.io.*;
import java.util.*;
class pandq{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int input_no=sc.nextInt();
		int y=input_no;
		ArrayList<Integer> factors_count=new ArrayList<Integer>(); 		//Counting no of factors 
		boolean flag=false,flag_min_set=false;					//flag will check whether we need to add count or not. flag_min_set is checking whether min is set or not.
		int count=0,min=2;
		/////////////////////////////Finding Factors and Their Count////////////////////////////////
		while(y%2==0){ 			//Finding factors of number 2
			flag=true;
			count++;
			y=y/2;
		}
		if(flag){
			factors_count.add(count);
			if(count!=1){
				
				min=count;
				flag_min_set=true;
			}
			flag=false;
		}
		/********************************Finding count of prime factors other than 2**********************/
		for(int j=3;j<=input_no/2;j+=2){
			count=0;
			while(y%j==0){
				flag=true;
				count++;
				y=y/j;
			}
			if(flag){
				factors_count.add(count);
				if(!flag_min_set && count!=1){
					min=count;
					flag_min_set=true;
				}
				if(min>count && count!=1)
					min=count;
				flag=false;
			}
		}
		flag=true;
		for(int i=0;i<factors_count.size();i++){
			if(factors_count.get(i)%min!=0){	//Check each factor is a multiple of count of minimum factor.
				flag=false;
				break;
			}
		}
		if(factors_count.size()==0){		//If a prime no then check
			flag=false;
		}
		if(flag)
			System.out.println("Yes");
		else
			System.out.println("No");



	}
}