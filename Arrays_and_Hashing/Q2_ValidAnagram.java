package Arrays_and_Hashing;

import java.util.Arrays;

public class Q2_ValidAnagram {

    //Given two strings s and t, return true if the two strings are anagrams of each other,
    // otherwise return false.

    //An anagram is a string that contains the exact same characters as another string,
    // but the order of the characters can be different.

    //Input: s = "racecar", t = "carrace"
    //Output: true

    public static void main(String[] args){

       String s = "racecar", t = "carrace";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
            return false;

        char[] s1= s.toCharArray();
        char[] t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        for(int i=0; i< s1.length; i++){

            if(s1[i]!=t1[i])
                return false;
        }

        return true;
    }

}
