package com.company;

public class Patient {
    String name;
    char sex;
    int age;
    float weight;
    boolean allergies;
    void setName(String str)

    {
        name=str;
    }

    void setSex(char s)
    {
        sex=s;
    }

    void setWeight(float w)
    {
        weight=w;
    }

    void setAllergies(boolean t)
    {
        allergies=t;
    }

    String getName() {
        return name;
    }
    public String toString()
    {
        return name+'\n'+sex+'\n'+weight+'\n'+allergies;
    }
}


