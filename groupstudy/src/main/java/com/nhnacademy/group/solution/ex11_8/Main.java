package com.nhnacademy.group.solution.ex11_8;

public class Main {
    public static void main(String[] args) {
        BigNumber x = new BigNumber("1");
        BigNumber y = new BigNumber("999999999");
        x.add(y);
        System.out.println(x);
    }
}
