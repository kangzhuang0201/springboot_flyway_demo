package com.example.demo;

public class test {
    public static void main(String[] args) {
        Long start =System.currentTimeMillis();

        Sumtest sumtest=new Sumtest();
        long sum = sumtest.sum();

        Long end =System.currentTimeMillis();
        System.out.println(sum);
        Long time=end-start;
        System.out.println("用时:"+time);
    }
}
