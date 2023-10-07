package com.nhnacademy.group.solution.ex11_8;

public class Main {
    public static void main(String[] args) {

        BigNumber num1 = new BigNumber("92345");
        BigNumber num2 = new BigNumber("99961");

        System.out.println(num1.add(num2));
        System.out.println(num2.add(num1));

        System.out.println(num1.sub(num2));
        System.out.println(num2.sub(num1));

        System.out.println(num1.equals(num2));
    }
}
