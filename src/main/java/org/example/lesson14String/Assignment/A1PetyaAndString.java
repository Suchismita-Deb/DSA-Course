package org.example.lesson14String.Assignment;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class A1PetyaAndString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        if(s.compareToIgnoreCase(s1)>0) {
            System.out.println("1");
        }
        else if(s.compareToIgnoreCase(s1)<0){
            System.out.println("-1");
        }
        else {
            System.out.println("0");
        }
    }
}

