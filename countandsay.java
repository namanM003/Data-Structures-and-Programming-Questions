import java.io.*;
import java.util.*;

class Solution {
    public static String countAndSay(int n) {
        int i=1,count=0,y,z;
        String s=""+i;
        char a[];
        String sol="";
        for(int j=0;j<n;j++){
            sol="";
            a=s.toCharArray();
            for(int k=0;k<a.length;k++ ){
                count=1;
                y=a.length;
                if(k==0 && y!=1 && a[k]!=a[k+1]){
                    sol=""+count;
                    sol=sol+""+a[k];
                }
                else{
                    z=k+1;
                    while(z<a.length && a[k]==a[k+1]){
                        count++;
                        k++;
                        z=k+1;
                    }
                    sol=sol+""+count+""+a[k];
                    count=1;
                }
                
                
            }
            s=sol;
        }
        return s;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        String s=countAndSay(x);
        System.out.println(s);
    }
}