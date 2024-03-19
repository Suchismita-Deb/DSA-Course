package org.example.Week6;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args){
        int arr1[] = {1,5,6,10};
        int arr2[] = {2,2,3,5,6,6};
        mergeSortedArray(arr1,arr2);

        prefixSum(arr2);
    }

    private static void prefixSum(int[] arr) {
        int prefix[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            prefix[i] = i>0? prefix[i-1]+arr[i] : arr[i];
            // we can store the first value and then calculate the sum.
        }
    System.out.println(Arrays.toString(prefix));
    }

    public static void mergeSortedArray(int[] arr1,int[] arr2){
        int a1 = arr1.length;
        int a2 = arr2.length;
        int arr[] = new int[a1+a2];
        int i=0,j=0;
        int pos=0;
        while(i<a1 && j<a2){
            // while there is value in array.
            if(arr1[i]<arr2[j]){
                arr[pos++] = arr1[i];
                i++;
            }
            else if(arr1[i]>arr2[j]){
                arr[pos++] = arr2[j];
                j++;
            }
            else{
                arr[pos++] = arr1[i];
                arr[pos++] = arr2[j];
                i++;
                j++;
            }
        }
        // remaining if that has additional value in the array.
        if(i!=a1){
            for(int val = i;val<a1;val++){
                arr[pos++] = arr1[val];
            }
        }
        else if(j!=a2){
            for(int val = j;val<a2;val++){
                arr[pos++] = arr2[val];
            }
        }
        /*
        while(i<a1){
        arr[pos++] = arr1[i];
        i++;
        }
        while(j<a2){
        arr[pos++] = arr2[j];
        j++;
        }
        */
        System.out.println(Arrays.toString(arr));
    }
}
