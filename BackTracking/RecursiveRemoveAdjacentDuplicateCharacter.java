package com.backtracking;

public class RecursiveRemoveAdjacentDuplicateCharacter {

    static String removeUtil(String str, char lastRemoved){
        // Base condition
        if(str.length() == 0 || str.length() ==1){
            return str;
        }

        if(str.charAt(0) == str.charAt(1)){
            lastRemoved = str.charAt(0);
            while(str.length() > 1 &&
                    str.charAt(0) == str.charAt(1)){
                str = str.substring(1, str.length());
            }
            str = str.substring(1,str.length());
            return removeUtil(str,lastRemoved);
        }

        String remString = removeUtil(str.substring(1, str.length()), lastRemoved);
        if(remString.length() != 0 && remString.charAt(0) == str.charAt(0)){
            lastRemoved = str.charAt(0);
            return remString.substring(1, remString.length());
        }

        if (remString.length() == 0 && lastRemoved == str.charAt(0)) {
            return remString;
        }

        return str.charAt(0) + remString;
    }

    static String remove(String str){
        char lastRemoved = '\0';
        return removeUtil(str, lastRemoved);
    }

    public static void main(String [] args){
        String str = "caaabbbbddddeeeeffff";
        System.out.println("input: " + str + "; output: " + remove(str));

        str = "caaabbbcddee";
        System.out.println("input: " + str + "; output: " + remove(str));

    }
}
