package org.example.lesson15StringFunction.Assignment;

public class A1ReverseLetter {
    public static void main(String[] args){
        String s = ":ab-cd*efg"; // gf-ed*cba.
        StringBuilder str = new StringBuilder();

        StringBuilder newStr = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))){
                newStr.append(s.charAt(i));
            }
        }
        int j=newStr.length()-1;
        System.out.println(newStr);
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
            if(!Character.isAlphabetic(s.charAt(i))){
                str.append(s.charAt(i));
            }
            else {
                str.append(newStr.charAt(j));
                j--;
            }
        }
        System.out.println();
        System.out.println(str);
    }
}
