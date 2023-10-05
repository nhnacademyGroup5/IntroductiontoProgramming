package com.nhnacademy.group.unit11.jiyh;

public class BigNumber {
    private byte[] numbers;

    BigNumber(String numberString){
        numbers = numberString.getBytes();

        for(int i=0; i<numbers.length; i++){
            System.out.println((char)numbers[i]);
        }
    }

    public byte[] getNumbers() {
        return numbers;
    }

}
