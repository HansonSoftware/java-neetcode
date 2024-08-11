package dev.haydenhanson.neetcode;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Unit tests for Contains Duplicate
 */

/**
 * ValidAnagramTest
 */
public class ValidAnagramTest {

    @Test
    public void testValidAnagram() {
        ValidAnagram solution = new ValidAnagram();

        String s = "anagram";
        String t = "nagaram";

        assertTrue(solution.validAnagram(s, t));

        s = "rat";
        t = "car";

        assertFalse(solution.validAnagram(s, t));

        s = "";
        t = "";

        assertTrue(solution.validAnagram(s, t));
    }

}
