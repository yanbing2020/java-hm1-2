//随机整数

package com.company;

public class Random {
    Random() {
    }
    int min=0;
    int max=0;
    int s=0;
    int arr[]=new int[100];

    void statistics() {
        for(int i=1;i<100;i++){
            arr[i]=(int)(Math.random()*100);
            if (arr[i]>max)
                max=arr[i];
            else
                min=arr[i];
            if (arr[i]>50)
                s++;
        }
        System.out.println("最大数是："+max+"\r");
        System.out.println("最小数是："+min+"\r");
        System.out.println("大于 50 的数是："+s+"\r");
    }

}

