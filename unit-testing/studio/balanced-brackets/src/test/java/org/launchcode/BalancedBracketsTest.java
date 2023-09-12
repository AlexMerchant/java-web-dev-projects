package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    // TODO: More opening brackets (positive)
    @Test
    public void moreOpeningThanClosingBrackets() {
        boolean expected = false;
        boolean actual = BalancedBrackets.hasBalancedBrackets("[[]");
        assertEquals(expected, actual);
    }

    // TODO: More close brackets (negative)
    @Test
    public void moreClosingThanOpeningBrackets() {
        boolean expected = false;
        boolean actual = BalancedBrackets.hasBalancedBrackets("[]]");
        assertEquals(expected, actual);
    }

    // TODO: A string containing more than just brackets that is also balanced should return true.
    @Test
    public void stringWithBalancedBracketsReturnsTrue() {
        boolean shouldBeTrue = BalancedBrackets.hasBalancedBrackets("This String has [a balanced [set of] brackets].");
        assertTrue(shouldBeTrue);
    }

    // TODO: A string containing more than just brackets that are not balanced should return false.
    @Test
    public void stringWithUnbalancedBracketsReturnsFalse() {
        boolean shouldBeFalse = BalancedBrackets.hasBalancedBrackets("This String has ]an unbalanced [set of] brackets].");
        assertFalse(shouldBeFalse);
    }

    // TODO: A string contains a balanced set of brackets but which are improperly nested, should return false
    @Test
    public void stringWithImproperlyNestedBracketsReturnsFalse() {
        String str = "][[]][][";
        boolean shouldBeFalse = BalancedBrackets.hasBalancedBrackets(str);
        assertFalse(shouldBeFalse);
    }
}