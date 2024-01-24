package org.example.lesson13MultiDimentionalArray.Assignment;

public class A1CountSortedRowGfg {
  public static void main(String[] args) {
     // N=3,M=3
     // Mat=[[1,2,3],[6,5,4],[7,9,8]]
     // O/P = 2 ( 1st row is increasing and 2nd row is decreasing. Two rows are increasing and decreasing)
    int arr[][] = {
            {1,2,3},{6,5,4},{7,9,8}
    };
    System.out.println(sortedCount(3,3,arr));
  }

  private static int sortedCount(int n, int m, int arr[][]) {
      // code here
      int count=0;
      int ascendingValue = 0;
      int descendingValue = 0;
      for(int i=0;i<n;i++){
        ascendingValue=0;
        descendingValue=0;
        for(int j=0;j<m-1;j++){
          if(arr[i][j]>arr[i][j+1]){
            descendingValue++;
          }
        }
        for(int j=0;j<m-1;j++){
          if(arr[i][j]<arr[i][j+1]){
            ascendingValue++;
          }
        }
        // When ascending then all should be ascending then the count should be fixed.
        if(ascendingValue==m-1 || descendingValue==m-1) count++;
      }
      return count;
  }
}
