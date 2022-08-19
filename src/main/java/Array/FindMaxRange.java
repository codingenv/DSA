package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindMaxRange {
    public static void main(String [] args) {
        int a[] = {1, 1, 2, 2, 3, 2, 2, 2, 2, 2, 2, 8, 9};
        int prev = a[0];
        int count = 0;
        int index = 0;
        int iniIndex = -1;
        int maxCount = 0;

        for(int i = 1; i< a.length; i++ ) {
            if (prev == a[i]) count++;
            else {
                count = 1;
                prev = a[i];
                index = i;
            }

            if (count > maxCount) {
                maxCount = count;
                iniIndex = index;
            }
        }

        System.out.println("Max Count : " + maxCount);
        System.out.println("Initial Index : " + iniIndex);
        System.out.println("Max Index : " + (iniIndex + maxCount));
        System.out.println("Value " + a[iniIndex]);
    }
}
