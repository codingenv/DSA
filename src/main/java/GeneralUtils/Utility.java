package GeneralUtils;

import java.util.Map;

/*
	Utitlity for genearal purpose.
*/

public class Utility {
    public static void printMap(Map<String, Integer> map){
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : "+ entry.getValue());
        }
    }


}
