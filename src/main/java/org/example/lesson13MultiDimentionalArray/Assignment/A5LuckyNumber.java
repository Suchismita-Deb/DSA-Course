package org.example.lesson13MultiDimentionalArray.Assignment;

import java.util.ArrayList;
import java.util.List;

public class A5LuckyNumber {
    public static void main(String[] args){
        int mat[][] = {
                {3,7,8},{9,11,13},{15,16,17}
        };
        luckyNumbers(mat);
    }
    public static void luckyNumbers (int[][] matrix) {
        int pos=0,p1=0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                    pos = j;
                }
            }
            for(int col = 0;col<matrix.length;col++){
                if(matrix[col][pos]>max){
                    max = matrix[col][pos];
                    p1 = col;
                }
            }
            if(max==min){
                arr.add(matrix[p1][pos]);
            }

        }
    System.out.println(arr);
    }
}
