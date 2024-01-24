package org.example.lesson14String.Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A2TwoGram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1= sc.next();
        String s = "BBAABBBA";
        HashMap<String,Integer> mp= new HashMap<>();
        System.out.println(s.substring(0,2));
        for(int i=0;i<s.length()-1;i++){
            mp.put(s.substring(i,i+2),mp.getOrDefault(s.substring(i,i+2),0)+1);
        }
        int max = Integer.MIN_VALUE;
        String res = "";
        for(Map.Entry<String ,Integer> entry : mp.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
                res = entry.getKey();
            }
        }
        System.out.println(mp);
        System.out.println(res);
    }
}
