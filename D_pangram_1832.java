package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class D_pangram_1832 {
    public static void main(String[] args) {
        //creating array of alphabets
        String alpha="abcdefghijklmnopqrstuvwxyz";
        char[] alph=new char[alpha.length()];
        for(int i=0; i<alpha.length(); i++) {
            char c = alpha.trim().charAt(i);
            alph[i] = c;
        }
        System.out.println(Arrays.toString(alph));

        //creating array of string input
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string");
        String str=in.next();
        ArrayList<Character> arr=new ArrayList<>(str.length());
        for(int i=0; i<str.length(); i++) {
            char c = str.trim().charAt(i);
            arr.add(c);
        }
        System.out.println(arr);

        while(true) {
            if (str.length() < 26) {
                System.out.println("not a pangram");
                break;
            }

            for (int c = 'a'; c <= 'z'; c++) {
                if (str.indexOf(c) == -1)
                    System.out.println("not a pangram");
                else if(c=='z'){
                    System.out.println("is a pangram");
                }
            }
            break;
        }
        /* int c=0
        for i in alpha:
        if i in str
        c=c+1
        if c==26
        string is pangram
         */
    }
}

//for i in str:
//if i in alpha:
//string is pangram

