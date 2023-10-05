package com.nhnacademy.group.unit11.jiyh;

public class Exercise7 {
    public static void main(String[] args) {
        MyString myString = new MyString("abcd");
        System.out.println("String : abcd\n");

        System.out.println("concat.('test') : "+myString.concat("test"));
        System.out.println("eqauls.(abcd): "+myString.equals("abcd"));
        System.out.println("subString.(1, length()) : "+myString.subString(1, myString.length()));
        System.out.println("length : "+myString.length());
        System.out.println("charAt.(1) : "+myString.charAt(1));
        System.out.println("indexOf.('1') : "+myString.indexOf('1'));

    }
}
