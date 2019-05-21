package com.company;
import com.company.Factorial;
import com.company.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("The Java World.");
//
//        Factorial F2  = new Factorial(2);
//        System.out.println(F2.fact());
//
//        Factorial F4 = new Factorial(4);
//        System.out.println(F4.fact());
//
//        Factorial F6 = new Factorial(6);
//        System.out.println(F6.fact());
//
//        Factorial F10 = new Factorial(10);
//        System.out.println(F10.fact());

    //0-99随机整数
//        Random RI = new Random();
//        RI.statistics();

        int i,j,m;

        Scanner s=new Scanner(System.in);

        System.out.println("Please input the first data:\r");

        i=s.nextInt();

        System.out.println("Please input the second data:\r");

        j=s.nextInt();

        deff cd=new deff();

        m=cd.deff(i,j);

        int n=(i*j)/m;

        System.out.println("最大公约数是："+m); System.out.println("最小公倍数是："+n);
    }
}
