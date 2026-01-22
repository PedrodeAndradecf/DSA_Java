package main;
import java.util.*;


public class BitonicArray {
    public static void main(String[] args) {
        System.out.println("Ola mundo");



    }



    public static int longestBitonicArray(List<Integer> trends){
        int n = trends.size();
        if(n == 0) return 0;

        List<Integer> inc = new ArrayList<>(Collections.nCopies(n, 1));
        List<Integer> dec = new ArrayList<>(Collections.nCopies(n, 1));

        for (int i = 1; i<n; i++){
            if(trends.get(i) >= trends.get(i-1)){
                int valorAnterior = inc.get(i-1);
                inc.set(i, valorAnterior + 1);
            }
        }

        for (int i = n-2; i>=0; i--){
            if(trends.get(i) >= trends.get(i+1)){
                int valorSeguinte = dec.get(i + 1);
                dec.set(i, valorSeguinte + 1);
            }

        }

        int maxLength = 1;
        for (int i = 0; i<n; i++){
            int total = inc.get(i) + dec.get(i) -1;
            if (total > maxLength){
                maxLength = total;
            }
        }

        return maxLength;

    }

}
