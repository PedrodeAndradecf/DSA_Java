package main;
/* Check for Non-Identical String Rotation
Given two strings s1 and s2, return 1 if s2 is a rotation of s1 but not identical to s1,
 otherwise return 0.
 */
public class CheckNRotation {


    public static boolean isRotation(String s1, String s2) {
        if (s1 == null || s2 == null) return false;
        if (s1.length() != s2.length()) return false;


        if (s1.equals(s2)) return false;
        String concatenated = s1 + s1;
        return concatenated.contains(s2);
    }
}
