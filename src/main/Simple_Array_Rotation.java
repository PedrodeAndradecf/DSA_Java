package main;
import java.util.*;



public class Simple_Array_Rotation {
    public static void main(String[] args){

        List<Integer> Array = Arrays.asList(1, 2, 3);

        List<Integer> ArrayB = Arrays.asList(0, 2);

        System.out.print(simpleRotation(Array, ArrayB));
    }




    public static List<Integer> simpleRotation(List<Integer> array, List<Integer> rotate) {
        int n = array.size();

        int maxIndexOrigin = 0;
        int maxValue = Integer.MIN_VALUE;

        List<Integer> result = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            if(array.get(i) > maxValue){
                maxValue = array.get(i);
                maxIndexOrigin = i;
            }
        }


        for (Integer k : rotate){
            int rot = k % n;

            int newIndex = maxIndexOrigin - rot;
            if(newIndex < 0){
                newIndex = n + newIndex;
            }

            result.add(newIndex);
        }

        return result;
    }



    public static List<Integer> simpleRotationStream(List<Integer> array, List<Integer> rotate) {
        int n = array.size();

        int maxIndexOrigin = 0;
        int maxValue = Integer.MIN_VALUE;




        for (int i = 0; i < n; i++) {
            if(array.get(i) > maxValue){
                maxValue = array.get(i);
                maxIndexOrigin = i;
            }
        }

        int finalMaxIndexOrigin = maxIndexOrigin;

        List<Integer> result = new ArrayList(rotate.stream()
                .map(k -> {
                    int rot = k % n;

                    int newIndex = finalMaxIndexOrigin - rot;
                    if(newIndex < 0){
                        newIndex = n + newIndex;
                    }
                    return newIndex;
                }).toList());

        return result;

    }





}


