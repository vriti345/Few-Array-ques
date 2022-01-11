package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Shuffle_the_Array_1470 {
    public static void main(String[] args) {
        System.out.println("enter the length");
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();

        System.out.println("enter elements");
        int[] arr=new int[len];
        for(int i=0; i<len; i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int[] one=new int[len/2];
        for(int i=0; i<len/2; i++){
            one[i]=arr[i];
        }
        System.out.println(Arrays.toString(one));
        int[] two=new int[len/2];
        for(int i=0; i<len/2; i++){
            two[i]=arr[(len/2)+i];
        }
        System.out.println(Arrays.toString(two));

        ArrayList<Integer> shuff=new ArrayList<>();
        for(int i=0; i<len/2; i++){
            shuff.add(one[i]);
            shuff.add(two[i]);
        }
        System.out.println(shuff);
    }
}
