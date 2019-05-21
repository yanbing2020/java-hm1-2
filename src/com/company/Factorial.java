package com.company;

public class Factorial {
    int n;
    Factorial(int x) {
        n=x;
    }
    int fact() {
        int t = 1, i;
        for(i = 1;i <= n; i++)
            t = t*i;
        return t;
    }
}
