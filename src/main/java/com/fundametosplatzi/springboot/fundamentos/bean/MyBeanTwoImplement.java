package com.fundametosplatzi.springboot.fundamentos.bean;

public class MyBeanImplement implements MyBean {

    @Override
    public void print() {
        System.out.println("Hole Mundo desde mi implementación del bean");
    }
}
