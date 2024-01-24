package org.example.lesson13MultiDimentionalArray.Assignment;

public class A2MatrixDiagonalSum {
  public static void main(String[] args) {
    // I/P = mat = [[1,2,3],
    //              [4,5,6],
    //              [7,8,9]]
    // Output: 25 (1+5+9+3+7)
      int mat[][] = {
              {1,2,3},{4,5,6},{7,8,9}
      };
    System.out.println(diagonalSum(mat));
   }
    public static int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i] + mat[i][mat.length-i-1];
        }
        // If odd then the middle element will be counted twice. We need to remove the middle element.
        if(mat.length%2!=0){
            sum-=mat[mat.length/2][mat.length/2];
        }
        return sum;
    }
}
