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
     ***  end LAUNCHCODE PROVIDED STARTER CODE
    */

    public static boolean hasBalancedBrackets(String str) {
        ArrayList<Character> openingBrackets = new ArrayList<>();
        ArrayList<Character> closingBrackets = new ArrayList<>();

        int brackets = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '[' || ch == '{' || ch == '(') {
                openingBrackets.add(ch);
                brackets++;

            } else if (ch == ']' || ch == '}' || ch == ')') {
                brackets--;

                if (!openingBrackets.isEmpty() && ch == ']') {
                    if (openingBrackets.get(openingBrackets.size() - 1) != '[') {
                        return false;
                    } else {
                        openingBrackets.remove(openingBrackets.size() - 1);
                    }
                } else if (!openingBrackets.isEmpty() && ch == '}') {
                    if (openingBrackets.get(openingBrackets.size() - 1) != '{') {
                        return false;
                    } else {
                        openingBrackets.remove(openingBrackets.size() - 1);
                    }
                } else if (!openingBrackets.isEmpty() && ch == ')') {
                    if (openingBrackets.get(openingBrackets.size() - 1) != '(') {
                        return false;
                    } else {
                        openingBrackets.remove(openingBrackets.size() - 1);
                    }
                } else if (openingBrackets.isEmpty() && (ch == ']' || ch == '}' || ch == ')')) {
                    return false;
                }
//                closingBrackets.add(ch);
            }
        }
/*
        int openingBracketsIndex = openingBrackets.size() - 1;
        int closingBracketsIndex = 0;

        while(openingBracketsIndex >= 0 && closingBracketsIndex < closingBrackets.size()) {
            if(openingBrackets.size() != closingBrackets.size()) {
                return false;

            } else if (openingBrackets.get(openingBracketsIndex) == '[' && closingBrackets.get(closingBracketsIndex) == ']') {
                System.out.println("Braces match.");

                openingBracketsIndex--;
                closingBracketsIndex++;

            } else if (openingBrackets.get(openingBracketsIndex) == '{' && closingBrackets.get(closingBracketsIndex) == '}') {
                System.out.println("Braces match.");

                openingBracketsIndex--;
                closingBracketsIndex++;

            } else if (openingBrackets.get(openingBracketsIndex) == '(' && closingBrackets.get(closingBracketsIndex) == ')') {
                System.out.println("Braces match.");

                openingBracketsIndex--;
                closingBracketsIndex++;

            } else {
                System.out.println("Braces mismatch");
                return false;
            }
        }*/
        return brackets == 0;
    }

//    public static void main(String[] args) {
//        System.out.println(BalancedBrackets.hasBalancedBrackets("[[]"));
//    }
}