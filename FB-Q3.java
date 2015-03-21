/*    Write a program that answers YES/NO search queries containing * placeholders. Example: if the data you have is (hazem, ahmed, moustafa, fizo), then you should answer as follows for:
     ahmed: YES
     m**stafa: YES
     fizoo: NO
     fizd: NO
     *****: YES
     ****: YES 
    **: NO
     Your program should be able to answer each search query in O(1).*/

    import java.io.*;
    import java.util.*;
    class ValidWords{
        static HashSet<String> hs=new HashSet<String>();
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            String[] str=new String[4];
            str[1]=sc.nextLine();
            str[2]=sc.nextLine();
            str[3]=sc.nextLine();
            str[0]=sc.nextLine();
            for(int i=0;i<4;i++){
                valids(str[i],0);
            }
            String str1;
            for(int i=0;i<10;i++){
                str1=sc.nextLine();
                if(hs.contains(str1)){
                    System.out.println("True");
                }
                else{
                    System.out.println("false");
                }
            }
            /*for(String s: hs){
                System.out.println(s);
            }*/
        }
        public static void valids(String s,int i){
            if(i==s.length())
            {
                hs.add(s);
               // System.out.println(s);
                return;
            }   
            else
                {
                    hs.add(s);
                   // System.out.println(s);
                }
            valids(s,i+1);
            valids(s.substring(0,i)+"*"+s.substring(i+1,s.length()),i+1);

            

        }
    }