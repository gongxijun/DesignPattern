package com.data.design.createmode.factorymethod.abstractfactory;

/**
 * @Author XiJun.Gong
 * @DATE 2017/2/22.
 * aim:   com.data.design.createmode.factorymethod.simplefactorypattern
 */
public class Main {
    public static void main(String args[]) throws InstantiationException, IllegalAccessException {
       HumanFactory humanFactory = new FemaleFactory();
        Human human =  humanFactory.getNewInstance();
        human.printSex();
    }
}
