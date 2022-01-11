package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Find_the_Highest_Altitude_1732 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter length");
        int len=in.nextInt();
        int[] gain=new int[len];
        System.out.println("enter elements");
        for(int i=0; i<len; i++){
            gain[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(gain));
        int[] alt=new int[len+1];
        alt[0]=0;
        for(int i=1; i<=len; i++){
            alt[i]=alt[i-1]+gain[i-1];
        }
        System.out.println(Arrays.toString(alt));

        int temp=alt[0];
        for(int a:alt){
            if(a>temp){
                temp=a;
            }
        }
        System.out.println("the maximum altitude is"+temp);
        System.out.println(gain.length);
    }
}
