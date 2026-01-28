package main;
import java.util.*;
public class FindSmallestMissingPositive {

    public static int firstMissingPositive(List<Integer> nums){
        if (nums.size() == 0 || nums.isEmpty()) return 1; // its impossible to have 0 missing numbers

        int n = nums.size();
        int i = 0;

        List<Integer> numsCopy = new ArrayList<>(nums);

        while( i < n){
            int value = nums.get(i);

            int finalPosition = value - 1;

            if(value > 0 && value <= n && value != numsCopy.get(finalPosition)){
                Collections.swap(numsCopy, i, finalPosition);
            }
            else{
                i++;
            }
        }

        int missing = 0;

        for(int j=0; j<n; j++){
            if(nums.get(j) != j + 1){
                missing = j + 1;
                return missing;
            }

        }

        return n + 1;
    }
}
