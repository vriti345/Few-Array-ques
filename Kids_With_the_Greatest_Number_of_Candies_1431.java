package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Kids_With_the_Greatest_Number_of_Candies_1431 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter length of array");
        int len=in.nextInt();

        System.out.println("enter the elements");
        int[] candies=new int[len];
        for(int i=0; i<len; i++){
            candies[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(candies));

        System.out.println("enter extra candies");
        int extra=in.nextInt();

        boolean[] ans=new boolean[len];
        for(int i=0; i<len; i++){
            candies[i]=extra+candies[i];
            int max=candies[0];
            for(int j=0; j<len; j++){
                if(candies[j]>max){
                    max=candies[j];
                }
            }
            if(max==candies[i]){
                ans[i]=true;
            }
            else{
                ans[i]=false;
            }
            candies[i]-=extra;
        }
        System.out.println(Arrays.toString(ans));
        /*
        Input: candies = [2,3,5,1,3], extraCandies = 3
        Output: [true,true,true,false,true]
         */
    }
}
