package main;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.*;
import java.util.Comparator;
/*
Given an array of intervals where each interval has a start and end time,
return the maximum number of non-overlapping intervals.
*/

public class MaxNumNonOverlapingIntervals {


    public static void main(String[] args) {


        List<Integer> response = List.of(3, 4, -1, 1);


    }

    public static int maxNonOvelarpping(List<List<Integer>> meetings){
        if (meetings.size() == 0 || meetings.isEmpty()) return 0;

        meetings.sort((a, b) -> Integer.compare(a.get(1), b.get(1)));


        int count = 0;
        int lastEnd = Integer.MIN_VALUE;


        for (List<Integer> reuniao : meetings){
            int start = reuniao.get(0);
            int end = reuniao.get(1);

            if(start >= lastEnd){
                count++;
                lastEnd = end;
            }
        }
        return count;
    }


}
