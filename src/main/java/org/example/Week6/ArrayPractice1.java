package org.example.Week6;

import java.util.ArrayList;

public class ArrayPractice1 {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(100);arr.add(800);arr.add(900);arr.add(700);arr.add(800);
        maxSumSubarraySizeK(arr,3);
    }

    private static void maxSumSubarraySizeK(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr.get(i);
        }
        int a = sum;

        for(int start = 1,end = n;end<arr.size();start++,end++){
            // tracking the window.The window is already created once now we are just shifting.
            // removing the first element and adding the last one.
            sum -= arr.get(start-1);
            sum += arr.get(end);
            a = Math.max(sum,a);
        }
        System.out.println(a);
    }
}
