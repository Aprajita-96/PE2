package com.stackroute.PE2;

public class Palindrome {

    public boolean isPalindrome(String input)
    {
        StringBuilder input1=new StringBuilder();
        input1=input1.append(input);

        input1=input1.reverse();
        if(input.contentEquals(input1)){
            return true;
        }
        return false;
    }
}

