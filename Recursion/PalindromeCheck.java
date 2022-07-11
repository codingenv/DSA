package Recursion;

public class PalindromeCheck {

    public static boolean palindromeCheck(String str, int i, int j){
        if(i>=j){
            return true;
        }
        if(str.charAt(i) != str.charAt(j)){
            return false;
        }

        return palindromeCheck(str, i + 1, j -1 );
    }

    public static void main(String [] args){
        String str = "MADAM";
        System.out.println(palindromeCheck(str,0, str.length() -1));
    }
}
