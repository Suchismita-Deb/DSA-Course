package org.example.Week7;

import java.util.Arrays;

public class ArrayPractice6 {
    public static void main(String[] args){
        int arr[] = {2,6,4,8,10,9,15};
        findUnsortedSubarrayNotOptimized(arr);
    }
    public static int findUnsortedSubarrayNotOptimized(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i];
        }
        Arrays.sort(arr);
        int start = -1;
        int end = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=arr[i]){
                start = i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]!=arr[i]){
                end = i;
                break;
            }
        }
        //System.out.println(start+" "+end);
        if(start==-1 && end==-1) return 0;
        // else we can initialize with -2.
        return end-start+1;
    }
}
