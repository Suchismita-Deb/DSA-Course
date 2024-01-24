package org.example.lesson14String.ClassWork;

public class StringBuilder1 {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("Hello");
        str.setCharAt(2,'W');
        System.out.println(str);
        str.append("World");
        System.out.println(str);
    }
}
