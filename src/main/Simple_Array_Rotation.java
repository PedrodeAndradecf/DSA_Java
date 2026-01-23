package main;
import java.util.*;



public class Simple_Array_Rotation {
    public static void main(String[] args){

        List<Integer> Array = Arrays.asList(1, 2, 3);

    }




    public static void simpleRotation(List<Integer> array, List<Integer> arrayB) {
        int n = array.size();
        int currently = n -1 ;

        int times = arrayB.size() ;
        
        List<Integer> rotatedArray = new ArrayList<>(array);
        List<Integer> highIndexArray = new ArrayList<>(array);
        Collections.sort(rotatedArray);

        highIndexArray.set(0, array.get(currently));

        for (int i = 0; i < n; i++){
            rotatedArray.set(i, i-1);
            highIndexArray.set(i + 1, array.get(currently - 1));
            currently--;

        }

        System.out.println(rotatedArray);
    }
}


