package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        int find=64;
        Scanner in = new Scanner(System.in);
        System.out.println("enter length");
        int len=in.nextInt();
        if(len==0){
            System.out.println("your array doesnt contain any element so no searching");
        }
        int[] arr=new int[len];
        for(int i=0; i<len; i++){
            System.out.println("enter the "+(i+1)+"th element pls:");
            arr[i]=in.nextInt();
        }
        for(int i=0; i<len; i++){
            if (arr[i] == find) {
                System.out.println(find + " is found in " + Arrays.toString(arr));
                break;
            }
            if (i == len - 1 && arr[i] != find) {
                System.out.println("no. not found");
            }
        }

    }
}
