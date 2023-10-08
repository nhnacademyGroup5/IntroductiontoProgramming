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
        String tmp = input;
        while(tmp.length() > 9){
            list.add(Integer.parseInt(tmp.substring(tmp.length() - 9)));
            tmp = tmp.substring(0,tmp.length() - 9);
        }
        list.add(Integer.parseInt(tmp));
    }

    public void arrange() {
        for (int i = 0; i < length(); i++) {
            if(list.get(i) >= 1_000_000_000){
                if(i == length() - 1) {
                    list.add(1);
                } else {
                    list.set(i + 1, list.get(i + 1) + 1);
                }
                list.set(i, list.get(i) - 1_000_000_000);
            }
        }
    }

    public void add(BigNumber num){
        int minDigit = Math.min(this.length(), num.length());
        int count = 0;
        while(count < Math.max(length(), num.length())){
            if(count < minDigit){
                list.set(count, list.get(count) + num.getList().get(count));
            } else {
                if(minDigit == length()){
                    list.add(num.getList().get(count));
                }
            }
            count++;
        }
        arrange();
    }

    public BigNumber difference(BigNumber num){
        if(length() < num.length()){
            System.out.println("차이가 음수 입니다.");
            return new BigNumber("0");
        }
        BigNumber tmp = this;
        for (int i = 0; i < num.length(); i++) {
            int diff = tmp.getList().get(i) - num.getList().get(i);
            if(diff < 0){
                diff += 1_000_000_000;
                tmp.getList().set(i + 1, tmp.getList().get(i + 1) - 1);
            }
            tmp.getList().set(i, diff);
        }
        while(tmp.getList().get(tmp.length() -1 ) == 0){
            tmp.getList().remove(tmp.length()-1);
        }
        return tmp;
    }

    public boolean bigNumberEquals(BigNumber num){
        return list.equals(num.getList());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = list.size() - 1; i >= 0 ; i--) {
            sb.append(i == list.size() - 1 ?  list.get(i) : String.format("%09d", list.get(i)));
        }
        return "[BigNumber] " + sb;
    }
}
