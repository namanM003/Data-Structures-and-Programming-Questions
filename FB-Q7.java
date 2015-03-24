/*Mobile Numeric Keypad Problem*/
import java.io.*;
import java.util.*;
class no_of_strings{
	public static void main(String args[]){
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int row[]={0,0,-1,1,0};
		int col[]={1,-1,0,0,0};
		int moves[][]=new int[10][n+1];
		for(int i=0;i<10;i++){
			moves[i][0]=0;
			moves[i][1]=1;
		}
		for(int i=2;i<=n;i++){
			for(int curr_row=0;curr_row<=3;curr_row++){
				for(int curr_col=0;curr_col<3;curr_col++){
					if(keypad[curr_row][curr_col]=='*' || keypad[curr_row][curr_col]=='#')
						continue;
					int num=keypad[curr_row][curr_col]-'0';
					moves[num][i]=0;
					for(int ro_change=0;ro_change<row.length;ro_change++){
						for(int co_change=0;co_change<col.length;co_change++){
							int new_row=curr_row+row[ro_change];
							int new_col=curr_col+col[co_change];
							if(new_col<3 && new_col>=0 && new_row>=0&& new_row<4)
							int new_num=keypad[new_row][new_col]-'0';
							if(new_num!='*' && new_col!='#')
								moves[num][i]+=moves[new_num][i-1];
						}
					}
				}
			}
		}
		int possible=0;
		for(int i=0;i<moves.length;moves++){
			possible+=moves[i][n];
		}
		System.out.println(possible);
	}
}