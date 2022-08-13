package Recursion;

public class PrintAllPermutationOfAString {

    public static void permute(String str, int left, int right){
        if(left == right){
            System.out.println(str);
        }else{
            for(int i = left; i<=right; i++){
                str = swap(str, left, i);
                permute(str, 1 + left, right);
                str = swap(str, left, i);
            }
        }
    }

    public static String swap(String str, int i, int j){
        char temp;
        char [] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }



    public static void main(String args[]){
        String str = "ABC";
        permute(str, 0, str.length() -1);

    }
}
