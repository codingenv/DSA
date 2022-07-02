package com.string;

/*
Finding sub string in a given string in time complexity 
of O(n).
*/
public class FindSubString {
    public static void main (String[] args) {
        String s1 = "This is a test text.";
        System.out.println(Substr("text", s1));
    }

    public static int Substr(String s2, String s1){
        int counter = 0; //pointing s2
        int i = 0;
        int len1 = s1.length();
        int len2 = s2.length();

        for( ; i < len1 ; i++){

            if(counter == len2) {
                break;
            }

            if(s2.charAt(counter) == s1.charAt(i)){
                counter++;
            }else{
                //Special case where character preceding the i'th character is duplicate
                if(counter>0){
                    i = i - counter;
                }
                counter = 0;
            }
        }
        return counter < s2.length() ? -1 : i - counter;
    }
}
