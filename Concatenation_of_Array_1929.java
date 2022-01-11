package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Concatenation_of_Array_1929 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter length");
        int len = in.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("enter " + i + "th element");
            nums[i] = in.nextInt();
        }
        int lens = 2 * len;
        int[] ans = new int[lens];
        for (int i = 0; i < len; i++) {
            ans[i] = nums[i];
            ans[i + len] = nums[i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(ans));
    }
}

