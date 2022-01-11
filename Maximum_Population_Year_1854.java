package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Population_Year_1854 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("eneter length");
        int len = in.nextInt();
        int[][] arr = new int[len][2];
        System.out.println("enter the array elements pls");
        for(int i=0; i<len; i++){
            for(int j=0; j<2; j++){
                arr[i][j]=in.nextInt();
            }
        }
        int[] person_count=new int[len];
        for(int i=0; i<len; i++){
            int pc=1;
            int year=arr[i][0]; int years=arr[i][1];
            for(int j=0; j<len && j!=i; j++){
                if((year>=arr[j][0] && year<arr[j][1])||(years>=arr[j][0] && years<arr[j][1])){
                    pc=pc+1;
                }
            }
            person_count[i]=pc;
        }
        System.out.println(Arrays.toString(person_count));

        int temp=person_count[0];
        for(int a:person_count){
            if(a>temp){
                temp=a;
            }
        }
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                if(person_count[i]==person_count[j] && person_count[i]==temp){
                    if(arr[i][0]>arr[j][0]){
                        System.out.println("the max pop. count is in the year"+arr[j][0]);
                        break;
                    }
                    else{
                        System.out.println("the max pop. count is in the year"+arr[i][0]);
                        break;
                    }
                }
                else if(person_count[j]==temp){
                    System.out.println("the max pop. count is in the year"+arr[j][0]);
                    break;
                }
            }
        }
    }
}


