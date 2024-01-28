package org.example.lesson14String.ClassWork;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args){
        String s = "Hello";
        String s1 = new String("World");
        System.out.println(s+" "+s1);
        // User input.
        Scanner sc = new Scanner(System.in);
        String s2 = sc.next(); // Input = abc def. It will take abc. It takes before the space or tab or enter.
        String s3 = sc.nextLine(); // Takes the entire line.

        System.out.println(s1.substring(0,3)); // Including start to before end.

        String s4 = "abc,def,gh";
        System.out.println(Arrays.toString(s4.split(","))); // split(",") will split the string in "," and store in the array.

    // s.contains("abc");
    // s.trim(); // Removes the front and the end space. Spaces in between will be there.

        String s5 = "abcHello";
    System.out.println(s.equals(s5));
    System.out.println(s.equalsIgnoreCase(s5));
    System.out.println(s.compareToIgnoreCase(s5));
    System.out.println();

    // Integer.parseInt(str) // String to integer.
        // Integer.toString(1020) // Integer to String.
    }
}
