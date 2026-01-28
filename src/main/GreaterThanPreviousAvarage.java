package main;
import java.util.*;
/*Given an array of positive integers,
 return the number of elements that are strictly greater than the average of all previous elements.
 Skip the first element.
 */

public class GreaterThanPreviousAvarage {



    public static int countResponse(List<Integer> responseTime){
        if (responseTime.size() == 0 || responseTime.isEmpty()) return 0;

        long currentSum = responseTime.get(0);
        int count = 0;

        int n = responseTime.size();
        for (int i = 1; i<n; i++){
            if (responseTime.get(i) > currentSum/i){
                count++;
            }
            currentSum += responseTime.get(i);
        }
        return count;
    }

}
