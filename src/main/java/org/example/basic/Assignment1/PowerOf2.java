package org.example.basic.Assignment1;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        // If anytime the remainder is odd other than 1 then it is not a power of 2.
        while(n!=0){
            if(n%2!=0 && n!=1){
                System.out.println("NO");
                count =1;
                break;
            }
            n=n/2;
        }
        if(count==0)
            System.out.println("YES");
    }
}
