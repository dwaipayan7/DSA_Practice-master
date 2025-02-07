package PracticeNew;

import java.util.Stack;

public class SimplifyPath {

    public static String simplifyString(String path){
        String[] arr = path.split("/");
        Stack<String> stack = new Stack<>();

        for (String i : arr){
            if (i.equals("..") && !stack.isEmpty()){
                stack.pop();
            }else if (!i.equals("") && !i.equals(".") && !i.equals("..")){
                stack.push(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String i : stack){
            sb.append("/");
            sb.append(i);
        }

        return sb.length() == 0 ? "/" : sb.toString();

    }

    public static void main(String[] args) {
        // Test cases
        String path1 = "/home/";
        String path2 = "/../";
        String path3 = "/home//foo/";
        String path4 = "/a/./b/../../c/";
        String path5 = "/a/../../b/../c//.//";
        String path6 = "/a//b////c/d//././/..";

        // Simplify paths and print results
        System.out.println("Simplified path for \"" + path1 + "\": " + simplifyString(path1));
        System.out.println("Simplified path for \"" + path2 + "\": " + simplifyString(path2));
        System.out.println("Simplified path for \"" + path3 + "\": " + simplifyString(path3));
        System.out.println("Simplified path for \"" + path4 + "\": " + simplifyString(path4));
        System.out.println("Simplified path for \"" + path5 + "\": " + simplifyString(path5));
        System.out.println("Simplified path for \"" + path6 + "\": " + simplifyString(path6));
    }

}
