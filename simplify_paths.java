/*
Given an absolute path for a file (Unix-style), simplify it.

For example,
path = "/home/", => "/home"
path = "/a/./b/../../c/", => "/c"*/
public class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<String>();
        String s ="";
        path = path.trim();
        String array[] = path.split("/");
        //System.out.println(array.length);
        for(String str:array){
           // System.out.println(str);
           if(str.isEmpty())
            continue;
            if(str.equals("."))
                continue;
            if(str.equals("..")){
                if(!stack.isEmpty())
                    stack.pop();
                continue;
            }
            else
                stack.push(str);
        }
        System.out.println(stack.size());
        while(!stack.isEmpty())
            if(s!=""){
                s = stack.pop() +"/"+ s;
               // System.out.println(s);
            }
            else{
                s = stack.pop();
                //System.out.println(s);
            }
        s = "/"+s;
       // System.out.println(s);
        return s;
        
    }
}