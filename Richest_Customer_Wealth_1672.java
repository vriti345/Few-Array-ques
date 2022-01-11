package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Richest_Customer_Wealth_1672 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter no of customers");
        int cust = in.nextInt();
        System.out.println("enter no of banks");
        int banks = in.nextInt();
        int[][] arr = new int[cust][banks];
        for (int i = 0; i < cust; i++) {
            for (int j = 0; j < banks; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
        //creating a list that stores bank_bal of all customers
        ArrayList<Integer> bbcust=new ArrayList<>();
        for (int[] a : arr) {
            int bb=0;
            for(int i=0; i<a.length; i++){
                bb=bb+a[i];
            }
            bbcust.add(bb);
        }
        //finding max of bank balance
        int temp=bbcust.get(0);
        for(int a:bbcust){
            if(a>temp){
                temp=a;
            }
        }
        //finding person with max bank balance
        int numb=0;
        for(int i=0; i<bbcust.size(); i++){
            if(bbcust.get(i)==temp){
                numb=i;
            }
        }
        //temp-has the max sum
        //numb-person with max sum
        System.out.println("wealthiest person is "+(numb+1)+"th person with sal of "+temp);
    }
}
