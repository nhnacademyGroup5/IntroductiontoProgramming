package com.nhnacademy.group.unit11.jiyh;

public class MyString {

    private char[] value;
    private String str;

    public MyString(String str){
        value = str.toCharArray();
        this.str = str;
    }

    public int length(){
        return value.length;
    }

    public String concat(String input){
        StringBuilder sb = new StringBuilder(str);
        sb.append(input);

        return sb.toString();
    }

    public char charAt(int idx){
        return value[idx];
    }

    public int indexOf(char ch){
        for(int i=0; i<value.length; i++){
            if(ch == value[i]) return i;
        }

        return -1;
    }

    public boolean equals(String input){
        char[] inputString = input.toCharArray();
        if(value.length != inputString.length) return false;

        for(int i=0; i<value.length; i++){
            if(value[i] != inputString[i]) return false;
        }

        return true;
    }

    public String subString(int left, int right){
        StringBuilder sb = new StringBuilder();

        for(int i=left; i<right; i++){
            sb.append(value[i]);
        }

        return sb.toString();
    }

}
