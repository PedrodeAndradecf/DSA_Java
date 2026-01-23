package main;
import java.util.*;

import static java.lang.Integer.MAX_VALUE;

public class MaxGreatness {
    public static void main(String[] args){

        List<Integer> array = Arrays.asList(1,3,5,2,1,3,1);
        int result = findMaxGreatness(array);
        System.out.println("Max Greatness: " + result);

    }



    public static int findMaxGreatness(List<Integer> array){
        int n = array.size();

        Collections.sort(array);
        List<Integer> sortedArray = new ArrayList<>(array);

        int alvo = 0;
        int maxG = 0;

        for(int i = 0; i<n; i++){
            if(sortedArray.get(i) > array.get(alvo)){
                sortedArray.set(i, array.get(alvo));
                alvo ++;
                i = alvo;
                maxG ++;
            }
        }



        return maxG;
    }
}
