package org.launchcode;

import java.util.ArrayList;

public class BalancedBrackets {
    /*
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */

    /*
     *** START LAUNCHCODE PROVIDED STARTER CODE
        public static boolean hasBalancedBrackets(String str) {
            int brackets = 0;
            for (char ch : str.toCharArray()) {
                if (ch == '[') {
                    brackets++;
                } else if (ch == ']') {
                    brackets--;
                }
            }
            return brackets == 0;
        }
     ***  END LAUNCHCODE PROVIDED STARTER CODE
    */

    public static boolean hasBalancedBrackets(String str) {
        ArrayList<Character> openingBrackets = new ArrayList<>();

        int brackets = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '[' || ch == '{' || ch == '(') {
                // If an opener is encountered, add it to the end of the openingBrackets ArrayList, increase brackets by 1
                openingBrackets.add(ch);
                brackets++;

            } else if (ch == ']' || ch == '}' || ch == ')') {
                // If a closer is encountered, decrease brackets by 1 and then look for additional functionality based on the type of closer
                brackets--;

                /*
                 *The idea of the if-else branches below are to determine whether the currently selected closer character is of the same type as the most recently encountered opener character that is stored at the end of the openingBrackets ArrayList.
                 *
                 * First, we check to see if the openingBrackets ArrayList is NOT empty, because we do not want to try and access an element at index -1 (if we didn't check and this was encountered an error would be thrown.
                 *
                 * Once openingBrackets has been validated as NOT empty, we then compare the last element of the list to the corresponding opener of the closing character.
                 * * If they do not match, then we can assume that the String is unbalanced because the current closer should always be of matching type to last opener
                 * * If the types do match, then that segment of the String is balanced. We remove the last element of the openingCharacters ArrayList so we can compare next encountered closer with the next opener now stored at the new end of the list.
                 */

                if (!openingBrackets.isEmpty() && ch == ']') {
                    if (openingBrackets.get(openingBrackets.size() - 1) != '[') {
                        // If '[' & ']' do not correspond, String is unbalanced
                        return false;
                    } else {
                        openingBrackets.remove(openingBrackets.size() - 1);
                    }
                } else if (!openingBrackets.isEmpty() && ch == '}') {
                    if (openingBrackets.get(openingBrackets.size() - 1) != '{') {
                        // If '{' & '}' do not correspond, String is unbalanced
                        return false;
                    } else {
                        openingBrackets.remove(openingBrackets.size() - 1);
                    }
                } else if (!openingBrackets.isEmpty() && ch == ')') {
                    // If '(' & ')' do not correspond, String is unbalanced
                    if (openingBrackets.get(openingBrackets.size() - 1) != '(') {
                        return false;
                    } else {
                        openingBrackets.remove(openingBrackets.size() - 1);
                    }
                } else if (openingBrackets.isEmpty() && (ch == ']' || ch == '}' || ch == ')')) {
                    // If there are no elements in the openingBrackets list and there is still an instance of a closer, then the String is unbalanced
                    return false;
                }
            }
        }

        /*
         * If brackets does not equal zero, then there is at least one extra opener or closer and the String is unbalanced
         * If brackets equals zero, then the String is balanced
         */

        return brackets == 0;
    }

}