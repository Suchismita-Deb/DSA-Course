package org.example.lesson13MultiDimentionalArray.Assignment;

import org.w3c.dom.ls.LSOutput;

public class A4TransposeMatrix {
    public static void main(String[] args){
        // [[1,2,3],[4,5,6],[7,8,9]]
        // O/P = [[1,4,7],[2,5,8],[3,6,9]]
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
        transposeSquare(mat);
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }


    }
    public static int[][] transposeSquare(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int temp = matrix[i][j];
                int temp1 = matrix[j][i];
                matrix[i][j] = temp1;
                matrix[j][i] = temp;
                System.out.print(temp+" "+temp1);
            }
            System.out.println();
        }
        return matrix;
    }
}
