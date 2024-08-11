package dev.haydenhanson.neetcode;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Unit tests for Contains Duplicate
 */
public class ContainsDuplicateTest {
    @Test
    public void testContainsDuplicate() {
        ContainsDuplicate solution = new ContainsDuplicate();

        int[] nums1 = { 1, 2, 3, 1 };
        int[] nums2 = { 1, 2, 3, 4 };
        int[] nums3 = { 1, 1, 1, 1 };

        assertTrue(solution.containsDuplicate(nums1));
        assertFalse(solution.containsDuplicate(nums2));
        assertTrue(solution.containsDuplicate(nums3));
    }
}
