/*******Problem Statement: Given two version v1 and v2 find if they are equal or v1>v2 or v2>v1*********/
/**********Problem statement of leetcode***********/
import java.util.*;
 class Solution {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String v=sc.nextLine();
    String v2=sc.nextLine();
    System.out.println(compareVersion(v,v2));
    }
    public static int compareVersion(String version1, String version2) {
        String[] arr1;
        String[] arr2;
        version1+=".";
        version2+=".";
        arr1=version1.split("\\.");
        arr2=version2.split("\\.");
        int z,a,b;
        int x=arr1.length;
        int y=arr2.length;
        System.out.println(x+" "+y);
        if(x<y){
            z=x;
        }
        else{
            z=y;
        }
        for(int i=0;i<z;i++){
            a=Integer.parseInt(arr1[i]);
            b=Integer.parseInt(arr2[i]);
            if(a>b){
                return 1;
            }
            else{
                if(b>a)
                    return -1;
            }
        }
        if(x>y){
            return 1;
        }
        else{
            if(y>x)
                return -1;
            else
                return 0;
        }
        
                
        //return version1.compareTo(version2);
        
    }
}