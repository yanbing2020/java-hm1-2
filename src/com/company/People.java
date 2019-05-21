package com.company;


class Birth{
    int year,month,day;
    Birth(int m,int d,int y)
    {year=y; month=m; day=d;} }
    enum sex{ MAIL,FEMAIL;}


public class People {
    String name; Birth birth; sex s;
    float height; float weight;
    People(String name,Birth birth,sex s,float h,float w)
    {
        this.name=name;
        this.birth=birth;
        this.s=s;
        this.height=h;
        this.weight=w; }
    public String toString()
    {return this.name+'\t'+this.birth+'\t'+this.s+'\t'+this.height+'\t'+this.weight+'\t';}
}
