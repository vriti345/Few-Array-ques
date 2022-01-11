package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Flipping_an_Image_832 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the length");
        int len=in.nextInt();
        int[][] arr=new int[len][len];
        System.out.println("enter the elements");
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                arr[i][j]= in.nextInt();
            }
        }
        System.out.print("intial array: ");
        for(int[] a:arr) {
            System.out.print(Arrays.toString(a)+",");
        }
        System.out.println();
        for(int[] a:arr){
            int[] arra=new int[a.length];
            for(int i=a.length-1; i>-1; i--){
                arra[i]=a[a.length-i-1];
            }
            for(int i=0; i<a.length; i++){
                if(arra[i]==0){
                    arra[i]+=1;
                }
                else if(arra[i]==1){
                    arra[i]-=1;
                }
            }
            System.out.print(Arrays.toString(arra)+",  ");
        }
        System.out.println("is the final array");
    }
}
