package com.company;

import java.util.Scanner;

public class Find_Numbers_with_Even_Number_of_Digits_1295 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        int len=0;
        int t=1;
        while(num>=t){
            t=t*10;
            len=len+1;
        }
        System.out.println(len);
        if(len%2==0){
            System.out.println("has even digits");
        }
        else if(len%2!=0){
            System.out.println("odd digits");
        }
    }
}
