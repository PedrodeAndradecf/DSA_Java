package main;

public class PalindromeFiltering {


    public static boolean isAlphabeticPalindrome(String code) {
        if (code == null) return false;

        int left = 0;
        int right = code.length() - 1;

        while(left<right){
            char charLeft = code.charAt(left);
            char charRight = code.charAt(right);


            if(!Character.isLetter(charLeft)){
                left ++;
                continue;
            }

            if( !Character.isLetter(charRight)){
                right --;
                continue;
            }

            if(Character.toLowerCase(charLeft) != Character.toLowerCase(charRight)) return false;

            left++;
            right--;
        }


        return true;



    }

}
