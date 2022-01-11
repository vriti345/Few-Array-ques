package com.company;

import java.util.Scanner;

public class Number_of_Good_Pairs_1512 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter len");
        int len=in.nextInt();
        int[] arr=new int[len];
        System.out.println("enter the elements");
        for(int i=0; i<len; i++){
            arr[i]=in.nextInt();
        }
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                if(arr[i] == arr[j] && i < j){
                    System.out.print("("+i+","+j+") ");
                }
            }
        }
    }
}
