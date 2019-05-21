package com.company;
import com.company.Patient;


public class ex2 {

    /**

     * @param args

     */

    public static void main(String[] args) {

// TODO Auto-generated method stub

        Patient p=new Patient();

        p.setName("Zhangsan");

        p.setSex('M');

        p.setWeight(80);

        p.setAllergies(true);

        System.out.println(p.toString());

        Patient p2=new Patient();

        p2.setName("eric");

        p2.setSex('F');

        p2.setWeight(78);

        p2.setAllergies(false);

        System.out.println(p2.toString());

    }

}