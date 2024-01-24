package org.example.lesson15StringFunction.ClassWork;

public class SumOfFirstDigitAndLastDigit {
    public static void main(String[] args){
        int a = 12908;//1+8 = 9.
        String s = Integer.toString(a);
        StringBuilder str = new StringBuilder(s);
        int a1 = s.charAt(0)-'0';
        int a2 = s.charAt(s.length()-1)-'0';
        System.out.println(a1+a2);
    }
}
