package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    /* * * Positive Test Cases * * */
    @Test
    public void singlePairOfBrackets() {
        String msg = "a single pair of brackets should return true";
        boolean expected = true;
        boolean actual = BalancedBrackets.hasBalancedBrackets("[]");
        assertEquals(expected, actual, msg);
    }

    @Test
    public void singlePairOfCurlyBraces() {
        String msg = "a single pair of curly braces should return true";
        boolean expected = true;
        boolean actual = BalancedBrackets.hasBalancedBrackets("{}");
        assertEquals(expected, actual, msg);
    }

    @Test
    public void singlePairOfParenthesis() {
        String msg = "a single pair of parenthesis should return true";
        boolean expected = true;
        boolean actual = BalancedBrackets.hasBalancedBrackets("()");
        assertEquals(expected, actual, msg);
    }

    @Test
    public void multiplePairsNestedAndAdjacent() {
        String msg = "multiple pairs that are both nested and adjacent to one another should return true";
        boolean expected = true;
        boolean actual = BalancedBrackets.hasBalancedBrackets("{[()()[](){}()()]}");
        assertEquals(expected, actual, msg);
    }

    @Test
    public void nestedBalancedAndMultipleTypesWithString() {
        String msg = "nested and balanced pairs of multiple types, even with a String included, should return true";
        boolean expected = true;
        boolean actual = BalancedBrackets.hasBalancedBrackets("{([ Nested w/ Sting ])}");
        assertEquals(expected, actual, msg);
    }

    @Test
    public void multipleTypesWrappingIndividualStrings() {
        String msg = "Strings wrapped with balanced wrappers, even of different types, should return true";
        boolean expected = true;
        boolean actual = BalancedBrackets.hasBalancedBrackets("[Multiple] {Types} (w/ Strings)");
        assertEquals(expected, actual, msg);
    }

    @Test
    public void multipleTypesNestedWrappingIndividualStrings() {
        String msg = "A string with nested and balanced wrappers inter-weaved with Strings should return true";
        boolean expected = true;
        boolean actual = BalancedBrackets.hasBalancedBrackets("{ More Nested Types [ With (Strings) ] Fun (Strings) }");
        assertEquals(expected, actual, msg);
    }


    /* * * Negative Test Cases (Singles) * * */
    @Test
    public void singleBrackets() {
        String msg = "A single opening bracket should return false";
        boolean expected = false;
        boolean actual = BalancedBrackets.hasBalancedBrackets("[");
        assertEquals(expected, actual, msg);

        msg = "A single closing bracket should return false";
        actual = BalancedBrackets.hasBalancedBrackets("]");
        assertEquals(expected, actual, msg);
    }

    @Test
    public void singleCurlyBraces() {
        String msg = "A single opening curly brace should return false";
        boolean expected = false;
        boolean actual = BalancedBrackets.hasBalancedBrackets("{");
        assertEquals(expected, actual, msg);

        msg = "A single closing curly brace should return false";
        actual = BalancedBrackets.hasBalancedBrackets("}");
        assertEquals(expected, actual, msg);
    }

    @Test
    public void singleParenthesis() {
        String msg = "A single opening parenthesis should return false";
        boolean expected = false;
        boolean actual = BalancedBrackets.hasBalancedBrackets("(");
        assertEquals(expected, actual, msg);

        msg = "A single closing parenthesis should return false";
        actual = BalancedBrackets.hasBalancedBrackets(")");
        assertEquals(expected, actual, msg);
    }


    /* * * Negative Test Cases (Unbalanced Pairs) * * */
    @Test
    public void moreOpeningThanClosingBrackets() {
        String msg = "A string with more opening brackets than closing brackets should return false";
        boolean expected = false;
        boolean actual = BalancedBrackets.hasBalancedBrackets("[[]");
        assertEquals(expected, actual, msg);
    }

    @Test
    public void moreClosingThanOpeningBrackets() {
        String msg = "A string with more closing brackets than opening brackets should return false";
        boolean expected = false;
        boolean actual = BalancedBrackets.hasBalancedBrackets("[]]");
        assertEquals(expected, actual, msg);
    }

    @Test
    public void moreOpeningThanClosingCurlyBraces() {
        String msg = "A string with more opening curly braces than closing curly braces should return false";
        boolean expected = false;
        boolean actual = BalancedBrackets.hasBalancedBrackets("{{}");
        assertEquals(expected, actual, msg);
    }

    @Test
    public void moreClosingThanOpeningCurlyBraces() {
        String msg = "A string with more closing curly braces than opening curly braces should return false";
        boolean expected = false;
        boolean actual = BalancedBrackets.hasBalancedBrackets("{}}");
        assertEquals(expected, actual, msg);
    }

    @Test
    public void moreOpeningThanClosingParenthesis() {
        String msg = "A string with more opening parenthesis than closing curly parenthesis should return false";
        boolean expected = false;
        boolean actual = BalancedBrackets.hasBalancedBrackets("(()");
        assertEquals(expected, actual, msg);
    }

    @Test
    public void moreClosingThanOpeningParenthesis() {
        String msg = "A string with more closing parenthesis than opening curly parenthesis should return false";
        boolean expected = false;
        boolean actual = BalancedBrackets.hasBalancedBrackets("())");
        assertEquals(expected, actual, msg);
    }

    @Test
    public void properPairThenMismatch() {
        String msg = "A string that has a proper pair followed by unbalanced pairs should return false";
        boolean expected = false;
        boolean actual = BalancedBrackets.hasBalancedBrackets("[]({(})");
        assertEquals(expected, actual, msg);
    }

    @Test
    public void stringStartingWithCloserAndEndingWithOpener() {
        String msg = "A string that starts with a closer and ends with an opener is unbalanced and should return false";
        boolean expected = false;
        boolean actual = BalancedBrackets.hasBalancedBrackets("][[]][][][");
        assertEquals(expected, actual, msg);

        actual = BalancedBrackets.hasBalancedBrackets("}[[]())]{");
        assertEquals(expected, actual, msg);

        actual = BalancedBrackets.hasBalancedBrackets(")()[]{}(");
        assertEquals(expected, actual, msg);
    }

    @Test
    public void stringWithMismatchedPairs() {
        String msg = "A string that has mismatched pairs of openers and closers should return false";
        boolean expected = false;
        boolean actual = BalancedBrackets.hasBalancedBrackets("([{]})");
        assertEquals(expected, actual, msg);

        actual = BalancedBrackets.hasBalancedBrackets("({{])");
        assertEquals(expected, actual, msg);
    }
}