package com.nhnacademy.group.unit11.jiwon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BigNumber {
    private List<Integer> digits;

    public BigNumber(String numberString) {
        digits = new ArrayList<>();
        for (int i = numberString.length() - 1; i >= 0; i--) {
            char digitChar = numberString.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            digits.add(digit);
        }
    }

    private BigNumber(List<Integer> digits) {
        this.digits = digits;
    }

    public BigNumber add(BigNumber other) {
        List<Integer> resultDigits = new ArrayList<>();
        int result = 0;
        int maxLength = Math.max(this.digits.size(), other.digits.size());

        for (int i = 0; i < maxLength; i++) {
            int thisDigit = i < this.digits.size() ? this.digits.get(i) : 0;
            int otherDigit = i < other.digits.size() ? other.digits.get(i) : 0;

            int sum = thisDigit + otherDigit + result;
            result = sum / 10;
            resultDigits.add(sum % 10);
        }

        if (result > 0) {
            resultDigits.add(result);
        }

        return new BigNumber(resultDigits);
    }

    public BigNumber subtract(BigNumber other) {
        int maxLength = Math.max(this.digits.size(), other.digits.size());

        List<Integer> resultDigits = new ArrayList<>();
        int borrow = 0;

        for (int i = 0; i < maxLength; i++) {
            int thisDigit = i < this.digits.size() ? this.digits.get(i) : 0;
            int otherDigit = i < other.digits.size() ? other.digits.get(i) : 0;

            int diff = thisDigit - otherDigit - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            resultDigits.add(diff);
        }

        while (resultDigits.size() > 1 && resultDigits.get(resultDigits.size() - 1) == 0) {
            resultDigits.remove(resultDigits.size() - 1);
        }

        if (resultDigits.size() == 0) {
            resultDigits.add(0);
        }

        return new BigNumber(resultDigits);
    }

    public boolean isEqualTo(BigNumber other) {
        return this.digits.equals(other.digits);
    }

    public boolean isLessThan(BigNumber other) {
        return this.digits.size() < other.digits.size() ||
                (this.digits.size() == other.digits.size() && isLess(this.digits, other.digits));
    }

    private boolean isLess(List<Integer> digits1, List<Integer> digits2) {
        int size = digits1.size();
        for (int i = 0; i < size; i++) {
            if (digits1.get(i) < digits2.get(i)) {
                return true;
            } else if (digits1.get(i) > digits2.get(i)) {
                return false;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        Collections.reverse(digits);
        return digits.stream()
                .map(Object::toString)
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        BigNumber num1 = new BigNumber("12345");
        BigNumber num2 = new BigNumber("22111");
        BigNumber sum = num1.add(num2);
        BigNumber sub = num1.subtract(num2);

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("sum: " + sum);
        System.out.println("sub: " + sub);
        System.out.println("Are they equal? " + num1.isEqualTo(num2));
        System.out.println("Is num1 less than num2? " + num1.isLessThan(num2));
    }
}

