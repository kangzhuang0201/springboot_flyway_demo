package com.example.demo;

public class Sumtest {
    public long sum(){
        long sum=0;
        for (long i = 1; i <999999999 ; i++) {
            sum=sum+i;
        }
        return sum;
    }
}
