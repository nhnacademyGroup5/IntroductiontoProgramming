package com.nhnacademy.group.solution.ex11_8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BigNumber x = new BigNumber("1");
        BigNumber y = new BigNumber("999999999");
        System.out.println(y.difference(x));
        System.out.println(y);
    }
}
