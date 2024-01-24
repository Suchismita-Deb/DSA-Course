package org.example.lesson13MultiDimentionalArray.Assignment;

import java.util.ArrayList;

public class A3MatrixSnakePattern {
    public static void main(String[] args){
        int mat[][] = {
                {10,20,30,40},
                {80,70,60,50},
                {90,100,110,120},
                {160,150,140,130}
        };
    // Output = 10 20 30 40 50 60 70 80 90 100 110 120 130 140 150 160
    System.out.println(snakePattern(mat));
    }
    public static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            if(i%2==0){
                for(int j=0;j<matrix[i].length;j++){
                    arr.add(matrix[i][j]);
                }
            }
            else{
                for(int j=matrix[i].length-1;j>=0;j--){
                    arr.add(matrix[i][j]);
                }
            }
        }
        return arr;
    }
}
