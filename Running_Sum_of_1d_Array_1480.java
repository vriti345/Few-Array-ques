package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Running_Sum_of_1d_Array_1480 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter length");
        int len = in.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("enter " + i + "th element");
            nums[i] = in.nextInt();
        }
        int[] ans = new int[len];
        ans[0]=nums[0];
        for (int i = 1; i < len; i++) {
            ans[i]=nums[i]+ans[i-1];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(ans));

    }
}
