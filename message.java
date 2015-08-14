import java.util.*;
class message{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str= sc.nextLine();
		char[][] mobile = new char[10][];
		char alpha = 'a';
		for(int i = 2;i<mobile.length;i++){
			if(i==7 || i==9){
				mobile[i] = new char[4];
				for(int j=0;j<4;j++){
					mobile[i][j] = alpha;
					alpha++;
				}
				continue;
			}
			mobile[i] = new char[3];
			for(int j=0;j<3;j++){
				mobile[i][j] = alpha;
				alpha++;
			}
		}
		for(int i=2;i<mobile.length;i++){
			System.out.println(mobile[i]);
		}
		String[] strs = str.split(" ");
		String message = "";
		int index = 0;
		int char_index = 0;
		for(String s : strs){
			index = Character.getNumericValue(s.charAt(0));
			char_index = (s.length()-1)%mobile[index].length;
			message += mobile[index][char_index];
		}
		System.out.println(message);
	}
}