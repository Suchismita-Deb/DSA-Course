package org.example.lesson14String.ClassWork;

public class StringPalindrome {
    public static void main(String[] args){
        String s = "Madam";
        s = s.toLowerCase();
        int check = 0;
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            // while(i<=j){i++,j--}
            if(s.charAt(i)!=s.charAt(j)){
                System.out.println("Not palindrome.");
                check = 1;
                break;
            }
        }
        // Other than check we can make a variable by name ans and first will store "Yes" if the condition of palindrome fails then will store "No". Then will print the variable.
        if(check==0){
            System.out.println("Palindrome.");
        }
    }
}
