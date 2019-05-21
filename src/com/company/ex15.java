package com.company;

public class ex15 {
    /** * @param args */ public static void main(String[] args) {
        // TODO Auto-generated method stub

        People[] p=new People[10];

        p[0]=new People("Wang",new Birth(2,2,2),sex.MAIL,1.82f,120f);
        p[1]=new People("Zhang",new Birth(3,3,3),sex.MAIL,1.75f,150f);
        p[2]=new People("Li",new Birth(5,5,5),sex.MAIL,1.62f,110f);
        p[3]=new People("sha",new Birth(2,2,2),sex.MAIL,1.80f,120f);
        p[4]=new People("Zhao",new Birth(3,3,3),sex.MAIL,1.70f,150f);
        p[5]=new People("Sun",new Birth(5,5,5),sex.MAIL,1.60f,110f);
        p[6]=new People("He",new Birth(2,2,2),sex.MAIL,1.85f,120f);
        p[7]=new People("Yang",new Birth(3,3,3),sex.MAIL,1.76f,150f);
        p[8]=new People("Fen",new Birth(5,5,5),sex.MAIL,1.66f,110f);
        p[9]=new People("Ma",new Birth(5,5,5),sex.MAIL,1.61f,110f);
        for(int i=0;i<p.length;i++)
        {
            for(int j=0;j<p.length;j++)
            {
                People t=p[i];

                p[i]=p[j];

                p[j]=t;}}
        for(People people:p)
            { System.out.println(people); } }

    }