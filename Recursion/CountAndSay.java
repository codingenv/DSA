package Recursion;

public class CountAndSay {
    public static void main(String [] args){
        int n = 5;
        System.out.println(countAndSay(n));
    }

    public static String countAndSay(int n){
            if(n == 1) return "1";
            if(n == 2 ) return "2";

            String str ="11";
            for (int i = 3; i <= n; i++)
            {
                str += '$';
                int len = str.length();

                int cnt = 1;
                String tmp = "";
                char []arr = str.toCharArray();
                for (int j = 1; j < len; j++)
                {
                    if (arr[j] != arr[j - 1])
                    {
                        tmp += cnt + 0;
                        tmp += arr[j - 1];
                        cnt = 1;
                    }else cnt++;
                }
                str = tmp;
            }
            return str;
        }
}
