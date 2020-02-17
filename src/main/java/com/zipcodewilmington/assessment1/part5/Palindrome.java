package com.zipcodewilmington.assessment1.part5;

import java.util.HashSet;
import java.util.Set;

public class Palindrome {

    public Integer countPalindromes(String input){
        Set<String> palindromes = new HashSet<>();
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                if (isPalindrome(input.substring(i, j))) {
                    palindromes.add(input.substring(i, j));
                    //System.out.println(input.substring(i, j));
                    counter++;
                }
            }
        }
        return counter;
    }
    public boolean isPalindrome(String str){

        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters toc compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }
}
