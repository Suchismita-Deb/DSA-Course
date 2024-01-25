package org.example.lesson15StringFunction.ClassWork;

public class SumOfFirstDigitAndLastDigit {
    public static void main(String[] args){
        int a = 8;//1+8 = 9.
        String s = Integer.toString(a);
        StringBuilder str = new StringBuilder(s);

        int a1 = s.charAt(0)-'0'; // Converting the char to int.
        int a2 = s.charAt(s.length()-1)-'0';
        System.out.println(a1+a2);
        // From string.
        int num = Integer.parseInt(s.substring(0,1));
        int num1 = Integer.parseInt(s.substring(s.length()-1));
        System.out.println(num+num1);

    }
}
