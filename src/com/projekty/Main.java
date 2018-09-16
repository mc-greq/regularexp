package com.projekty;

public class Main {

    public static void main(String[] args) {
	    String string = "I am a string, yes I am";
        System.out.println(string);

        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghijkliijj99z";
        System.out.println(alphanumeric.replaceAll(".", "Y"));
        // ^ - start of the string
        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));

        String secondString = "abcDeeeF12GhiabcDeeejkliijj99z";
        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));

        System.out.println(alphanumeric.matches("^hello"));
        // whole string must match for it to return TRUE
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("^abcDeeeF12Ghijkliijj99z"));

        // $ is the opposite of ^ - looks at the end of the string
        System.out.println(alphanumeric.replaceAll("j99z$", "THE END"));
        // [] - all occurences of
        System.out.println(alphanumeric.replaceAll("[aei]", "X"));
        System.out.println(alphanumeric.replaceAll("[aei]", "I replaced a letted here"));
        // a or e or i followed by F or J
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));

        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

        // replace all letters but e and j
        // [^ej] - negation of e and j
        String newAlphanumeric = "abcDeeeF12Ghijkliijj99z";
        System.out.println(newAlphanumeric.replaceAll("[^ej]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]", "X"));
        // shorter than above
        System.out.println(alphanumeric.replaceAll("[a-f3-8]", "X"));
        // capital letters included
        System.out.println(alphanumeric.replaceAll("[a-fA-F3-8]", "X"));
        // turning off case-sensitivity
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]", "X"));
        // replace all digits
        System.out.println(newAlphanumeric.replaceAll("[0-9]", "X"));
        // \d does the same as above, additional \ is an escape character
        System.out.println(newAlphanumeric.replaceAll("\\d", "X"));
        // \D replaces all non-digits
        System.out.println(newAlphanumeric.replaceAll("\\D", "X"));

        String hasWhiteSpace = "I have blanks and\ta tab, and also a new line\n";
        System.out.println(hasWhiteSpace);
        // \s removes all whitespaces
        System.out.println(hasWhiteSpace.replaceAll("\\s", ""));
        // remove tabs
        System.out.println(hasWhiteSpace.replaceAll("\\t", ""));
        // \S remove all non-white space chars
        System.out.println(hasWhiteSpace.replaceAll("\\S", ""));

        System.out.println(newAlphanumeric.replaceAll("\\w", "X"));
        System.out.println(hasWhiteSpace.replaceAll("\\w", "X"));
        // \b surrounds each word with specified character
        System.out.println(hasWhiteSpace.replaceAll("\\b", "X"));

    }
}