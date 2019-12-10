package com.sabin.secondassignment.ui.tools;

public class automorphic {
    public int auto(int n)
    {
        int square = n * n;
        while (n > 0) {
            int d1 = n % 10;
            int d2 = square % 10;
            if (d1 != d2) {
                return d1;
            }
            n = n / 10;
            square = square / 10;
        }
        return square;
    }

}
