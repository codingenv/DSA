package array;

public class LargeFactorial {
    public static void main(String args[]){
        System.out.println(calculateFactorial(2));
    }

    public static String calculateFactorial(int n) {
        if(n == 0 || n ==1) return "1";

        String result = "1";
        for(int i = 2; i<=n ; i++)
            result = multiply(result, i );

        return result;

    }

    public static String multiply(String s, int n){
        String result = "";
        int length = s.length();
        int carry = 0;
        int tempresult = 0 ;
        for(int i = length -1; i> 0; i--){
            int leftValue = Character.getNumericValue(s.charAt(i));
            tempresult = n*leftValue + carry;
            carry = tempresult/10;
            int addingString = tempresult%10;
            result = addingString + result;
        }
        if(carry > 0){
            result = carry + result;
        }
        return result;
    }
}
