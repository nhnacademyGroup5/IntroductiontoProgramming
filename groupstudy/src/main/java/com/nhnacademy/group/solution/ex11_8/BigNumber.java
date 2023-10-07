package com.nhnacademy.group.solution.ex11_8;

import java.util.function.Consumer;

/**
 * Ex 11.8
 * 무한한 양의 정수를 입력 받아 사칙 연산을 할 수 있는 BigNumber Class를 만드는 문제입니다.
 * (BigInteger 기능을 하는 Class 만들어 보기)
 */
public class BigNumber {

    private Node head;
    private String strNumber;

    public BigNumber(String strNumber){
        this.strNumber = strNumber;
        createNumber(strNumber);
    }

    private void createNumber(String number){
        if(number.isEmpty()) return;

        int indexValue = number.charAt(number.length() - 1) - '0';
        if(head == null){
            head = new Node(indexValue);
            createNumber(number.substring(0, number.length()-1));
            return;
        }

        Node temp = head;
        while (temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(new Node(indexValue));
        createNumber(number.substring(0, number.length()-1));
    }

    public BigNumber sub(BigNumber subNumber){
        if(subNumber == null || head == null) return null;

        if(this.strNumber.length() < subNumber.strNumber.length()){
            return new BigNumber("0");
        }

        Node oper1 = head;
        Node oper2 = subNumber.head;
        boolean flag = false;
        StringBuilder sb = new StringBuilder();

        while (oper1 != null && oper2 != null){
            int sub = oper1.getValue() - oper2.getValue();

            if(flag) {
                flag = false;
                sub -= 1;
            }
            if(sub < 0){
                sub += 10;
                flag = true;
            }
            sb.append(sub);

            oper1 = oper1.getNext();
            oper2 = oper2.getNext();
        }

        if(oper1 != null) flag = builderAdd(sb, oper1, flag, -1);

        if(flag) return new BigNumber("0");
        if(sb.charAt(sb.length()-1) == '0') {
            sb.delete(sb.length()-1, sb.length());
        }

        return new BigNumber(sb.reverse().toString());
    }

    public BigNumber add(BigNumber addNumber){
        if(head == null || addNumber == null) return null;

        StringBuilder sb = new StringBuilder();
        boolean flag = false;

        Node oper1 = head;
        Node oper2 = addNumber.head;

        while (oper1 != null && oper2 != null){
            int sum = oper1.getValue() + oper2.getValue();

            if(flag){
                flag = false;
                sum += 1;
            }
            if(sum > 9){
                sum -= 10;
                flag = true;
            }
            sb.append(sum);

            oper1 = oper1.getNext();
            oper2 = oper2.getNext();
        }

        if(oper1 != null) flag = builderAdd(sb, oper1, flag, 1);
        if(oper2 != null) flag = builderAdd(sb, oper2, flag, 1);
        if(flag) sb.append(1);

        return new BigNumber(sb.reverse().toString());
    }

    public boolean builderAdd(StringBuilder sb, Node oper, boolean flag, int offset){
        if(oper == null) return true;

        while (oper != null){
            if(flag) {
                sb.append(oper.getValue()+offset);
                flag = false;
            }
            else sb.append(oper.getValue());
            oper = oper.getNext();
        }

        return false;
    }

    public boolean equals(BigNumber bigNumber) {
        return this.strNumber.equals(bigNumber.strNumber);
    }

    @Override
    public String toString() {
        return this.strNumber;
    }
}
