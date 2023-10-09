package com.nhnacademy.group.solution.ex11_8;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/**
 * Ex 11.8
 * 무한한 양의 정수를 입력 받아 사칙 연산을 할 수 있는 BigNumber Class를 만드는 문제입니다.
 * (BigInteger 기능을 하는 Class 만들어 보기)
 */
public class BigNumber {
    private final int BILLION = 1_000_000_000;
    private List<Integer> list = new ArrayList<>();

    public List<Integer> getList() {
        return list;
    }

    public int length(){
        return list.size();
    }

    public BigNumber(String input) {
        try {
            if (!Pattern.matches("^[0-9]*$", input)) {
                throw new IllegalArgumentException("BigNumber : 올바른 입력이 아닙니다.");
            }
            String tmp = input;
            while(tmp.length() > 9){
                list.add(Integer.parseInt(tmp.substring(tmp.length() - 9)));
                tmp = tmp.substring(0,tmp.length() - 9);
            }
            list.add(Integer.parseInt(tmp));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public BigNumber(List<Integer> list){
        try {
            for (int index : list) {
                if (index >= BILLION) {
                    throw new IllegalArgumentException("BigNumber : 올바른 입력이 아닙니다. (10억 이하의 값을 요소에 추가하세요.");
                }
            }
            this.list = list;
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public void arrange() {
        IntStream.range(0, length())
            .filter(i -> list.get(i) >= BILLION)
            .forEach(i -> {
                if (i == length() - 1) {
                    list.add(1);
                } else {
                    list.set(i + 1, list.get(i + 1) + 1);
                }
                list.set(i, list.get(i) - BILLION);
                }
            );
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
        List<Integer> tmp = new ArrayList<>();
        IntStream.range(0, num.length()).forEach(i -> {
            int diff = list.get(i) - num.getList().get(i);
            if(diff < 0){
                diff += BILLION;
                tmp.add(i + 1, list.get(i + 1) - 1);
            }
            tmp.add(i, diff);
        });
        while(tmp.get(tmp.size() -1 ) == 0){
        tmp.remove(tmp.size()-1);
        }
        return new BigNumber(tmp);
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
