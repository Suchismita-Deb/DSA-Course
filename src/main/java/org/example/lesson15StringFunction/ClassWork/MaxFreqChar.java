package org.example.lesson15StringFunction.ClassWork;

public class MaxFreqChar {
    public static void main(String[] args){
        String s = "aacccbcfbc";
        int arr[] = new int[256];
        System.out.println((int)s.charAt(0)); // ascii value of the char.
        System.out.println(s.charAt(0));// Char value.
        for(int i=0;i<s.length();i++){
            int val = s.charAt(i);
            arr[val]++;
        }
        int max = 0;
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                ans = i;
                max = arr[i];
            }
        }
        System.out.println(max+" "+(char)ans);
    }
}
