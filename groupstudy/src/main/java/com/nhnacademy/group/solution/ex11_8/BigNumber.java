package com.nhnacademy.group.solution.ex11_8;

import java.util.ArrayList;
import java.util.List;

/**
 * Ex 11.8
 * 무한한 양의 정수를 입력 받아 사칙 연산을 할 수 있는 BigNumber Class를 만드는 문제입니다.
 * (BigInteger 기능을 하는 Class 만들어 보기)
 */
public class BigNumber {
    private final List<Integer> list = new ArrayList<>();

    public List<Integer> getList() {
        return list;
    }

    public int length(){
        return list.size();
    }

    public BigNumber(String input) {
        if (input.length() <= 9) {
            list.add(Integer.parseInt(input));
        } else {
            for (int i = 1; i <= input.length() / 9; i++) {
                list.add(Integer.parseInt(input.substring(input.length() - 9 * i)));
            }
            list.add(Integer.parseInt(input.substring(0, input.length() % 9)));
        }
    }

    public void arrange(){
        for (int i = 0; i < length(); i++) {
            if(list.get(i) >= 1_000_000_000){
                if(i == length() - 1) {
                    list.add(list.get(i) / 1_000_000_000);
                }
                list.set(i + 1, list.get(i + 1) + list.get(i) / 1_000_000_000);
                list.set(i, list.get(i) % 1_000_000_000);
            }
        }
    }

    public void add(BigNumber num){
        int minDigit = Math.min(this.length(), num.length());
        int count = 0;
        while(count < Math.max(length(), num.length())){
            if(count < minDigit){
                list.set(count, list.get(count) + num.getList().get(count));
            }
            if(minDigit == length() && count >= minDigit){
                list.add(num.getList().get(count));
            }
            count++;
        }
        arrange();
    }

//    public BigNumber difference(BigNumber num){
//        if(this.length() < num.length()) return new BigNumber("0");
//        for (int i = 0; i < num.length(); i++) {
//
//        }
//    }

    public boolean bigNumberEquals(BigNumber num){
        return list.equals(num.getList());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = list.size() - 1; i >= 0 ; i--) {
            if (i == list.size() - 1) {
                sb.append(list.get(i));
                continue;
            }
            if(list.get(i) == 0) sb.append("000000000");
            if((int) Math.log10(list.get(i)) + 1 < 9){
                int count = 8 - (int) Math.log10(list.get(i));
                sb.append("0".repeat(Math.max(0, count)));
            } else{
                sb.append(list.get(i));
            }
        }
        return "[BigNumber] " + sb;
    }
}
