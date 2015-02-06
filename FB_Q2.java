import java.io.*;
import java.util.*;
class FB_Q2{
	static int valueobtained[];
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		File f=new File(s);
		br=new BufferedReader(new FileReader(f));
		File out=new File("output.txt");
		BufferedWriter bw=new BufferedWriter(new FileWriter(out));
		int t=Integer.parseInt(br.readLine());
		int n;
		int requirement[]=new int[3];
		String x[];
		int input[][];//=new int[3];
		boolean found=false;
		for(int i=0;i<t;i++){
			s=br.readLine();
			x=s.split(" ");
			found=false;
			for(int value=0;value<3;value++){
				requirement[value]=Integer.parseInt(x[value]);
			}
			n=Integer.parseInt(br.readLine());
			//nutri=new int[n][n][3];
			input=new int[n][3];
			for(int j=0;j<n && found==false;j++){
				s=br.readLine();
				x=s.split(" ");
				for(int in=0;in<3;in++){

					input[j][in]=Integer.parseInt(x[in]);
				}
				//System.out.println(input[0]+" "+input[1]+" "+input[2]);
			}
			int counter=0;
			for(counter=0;counter<(int)Math.pow(2,n);counter++){
				BitSet bitSet = BitSet.valueOf(new long[] { counter});
				int size=bitSet.size();
				valueobtained=new int[3];
				for(int check=0;check<size;check++){
					boolean get=bitSet.get(check);
					if(get){
						valueobtained[0]+=input[check][0];
						valueobtained[1]+=input[check][1];
						valueobtained[2]+=input[check][2];
					}

				}
				if(valueobtained[0]==requirement[0] && valueobtained[1]==requirement[1] && valueobtained[1]==requirement[1])
					{found=true; break;}
			}
			if(found==true){
				bw.write("Case #"+(i+1)+": yes\n");
			}
			else{
				bw.write("Case #"+(i+1)+": no\n");
			}
			bw.flush();

		}
	}
}
