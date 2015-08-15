/*Given Rectangle coordinate and its area find other 3 possible points*/
import java.util.*;
class rectangle{
	public static void main(String[] args){
		int area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Area: ");
		area = sc.nextInt();
		System.out.println("Enter x: ");
		int x = sc.nextInt();
		System.out.println("Enter y: ");
		int y = sc.nextInt();
		int length = 0;
		int bredth = 0;
		for(int i=1;i<=(int)Math.sqrt(area);i++){
			if(area%i==0){
				length = i;
				bredth = area/i;
				System.out.println("Coordinate 1: "+x+","+y+" Coordinate 2: "+(x+length)+","+(y+bredth)+" Coordinate 3: "+(x+length)+","+y+" Coordinate 4: "+x+","+(y+bredth));
				System.out.println("Coordinate 1: "+x+","+y+" Coordinate 2: "+(x+length)+","+(y-bredth)+" Coordinate 3: "+(x+length)+","+y+" Coordinate 4: "+x+","+(y-bredth));
				System.out.println("Coordinate 1: "+x+","+y+" Coordinate 2: "+(x-length)+","+(y+bredth)+" Coordinate 3: "+(x-length)+","+y+" Coordinate 4: "+x+","+(y+bredth));
				System.out.println("Coordinate 1: "+x+","+y+" Coordinate 2: "+(x-length)+","+(y-bredth)+" Coordinate 3: "+(x-length)+","+y+" Coordinate 4: "+x+","+(y-bredth));
			}
		}
	}
}