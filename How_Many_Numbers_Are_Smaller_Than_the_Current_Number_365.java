package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number_365 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter length");
        int len= in.nextInt();
        int[] arr=new int[len];
        System.out.println("enter elements");
        for(int i=0; i<len; i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int[] ans=new int[len];
        for(int i=0; i<len; i++){
            int c=0;
            int temp=arr[i];
            for(int a:arr){
                if(temp>a) {
                    c = c + 1;
                }
            }
            ans[i]=c;
        }
        //if u put c=0 outside the for loop then values are added in the value of c
        //[4,0,1,1,3]
        //[4,4+0,4+1,4+1+1,4+1+1+3]
        System.out.println(Arrays.toString(ans));
    }
}

