package com.data.design.createmode.factorymethod.Singleton;

/**
 * @Author XiJun.Gong
 * @DATE 2017/2/22.
 * aim:   com.data.design.createmode.factorymethod.Singleton
 */
public class Main {
    public static void main(String args[]) throws InstantiationException, IllegalAccessException {
        Human human =  new HumanFactory().create("Female");
        human.printSex();
    }
}
