package dev.haydenhanson.neetcode;

import java.util.*;

/**
 * Leetcode # 242: Valid Anagram
 * Given two strings s and t, return true if t is an anagram of s, and false
 * otherwise.
 * 
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters exactly
 * once.
 */
public class ValidAnagram {
    public boolean validAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sFreq = new HashMap<Character, Integer>();
        Map<Character, Integer> tFreq = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            Character c1 = s.charAt(i);
            if (sFreq.containsKey(c1)) {
                sFreq.put(c1, sFreq.get(c1) + 1);
            } else {
                sFreq.put(c1, 1);
            }

            Character c2 = t.charAt(i);
            if (tFreq.containsKey(c2)) {
                tFreq.put(c2, tFreq.get(c2) + 1);
            } else {
                tFreq.put(c2, 1);
            }
        }

        return sFreq.equals(tFreq);
    }
}
