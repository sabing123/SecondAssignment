package com.sabin.secondassignment.ui.Palindrome;

public class palindrome {

    public int back(int num)
    {
        int rev, reverse=0;

        while(num>0)
        {
            rev = num % 10;
            reverse = reverse * 10 + rev;
            num = num / 10;

        }
        return reverse;
    }
}
