package com.company;


import java.io.*;

public class ex12 {

    /** * @param args */
    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        int i=0,s=0;
        System.out.println("Please input data:");
        BufferedReader buff= new BufferedReader(new InputStreamReader(System.in));
        char c=(char)(buff.read());
        while(c!='#')
        {
            s++; c=(char)(buff.read()); }
        System.out.println(s);
    }

}