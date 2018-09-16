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
    }
}
