package Hakerrank.ThreeMonthsPreparationKit.Week1;
//https://www.hackerrank.com/challenges/three-month-preparation-kit-time-conversion/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-one

public class TimeConversion {
    public static void main(String []args){
        String str = "12:01:00AM";
        String str2 = "12:01:00PM";
        String str3 = "07:05:45PM"; //19:05:45

        System.out.println(timeConversion(str));
        System.out.println(timeConversion(str2));
        System.out.println(timeConversion(str3));

    }

    public static String timeConversion(String s) {
        String str = s.substring(s.length() -2, s.length());
        String returnStr = "";
        if(str.equalsIgnoreCase("AM")){

            String time = s.substring(0, 2);
            System.out.println(time);
            Integer xtime = Integer.valueOf(time);
            if(xtime >= 12){
                xtime = xtime - 12;
                String xtimeStr = "";
                if(String.valueOf(xtime).length()!=2){
                    xtimeStr = "0" + xtime;
                }
                returnStr = xtimeStr +  s.substring(2, s.length()-2);
            }else{
                returnStr = s.substring(0, s.length()-2);
            }


        }else{
            String time = s.substring(0, 2);
            System.out.println(time);
            Integer xtime = Integer.valueOf(time);
            if(xtime < 12){
                xtime = xtime + 12;
                String xtimeStr = "";
                if(String.valueOf(xtime).length()!=2){
                    xtimeStr = "0" + xtime;
                }else{
                    xtimeStr = String.valueOf(xtime);
                }
                returnStr = xtimeStr +  s.substring(2, s.length()-2);
            }else{
                returnStr = s.substring(0, s.length()-2);
            }

        }


        return returnStr;

    }
}
