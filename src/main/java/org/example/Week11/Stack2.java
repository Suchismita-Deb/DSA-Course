package org.example.Week11;

import java.util.Stack;

public class Stack2 {
    public static void main(String[] args){
        Stack<Integer> st =new Stack<>();
        String s[] = {"2","1","+","3","*"};
        int sum=0;
        for(String a:s){
            if(a.equals("+") || a.equals("+") || a.equals("+") || a.equals("+")){
                int num2 = st.pop();
                int num1 = st.pop();
                
                st.push(evaluate(num1,num2,a));
            }
            else{
                st.push(Integer.parseInt(a));
            }
        }
    System.out.println(st.pop());
    }

    private static int evaluate(int num1, int num2, String a) {
        if(a.equals("+")){
            return num1+num2;
        }
        if(a.equals("-")){
            return num1-num2;
        }
        if(a.equals("*")){
            return num1*num2;
        }
        return num1/num2;
    }
}
