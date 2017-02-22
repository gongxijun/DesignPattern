package com.data.design.createmode.factorymethod.abstractfactory;

/**
 * @Author XiJun.Gong
 * @DATE 2017/2/22.
 * aim:   com.data.design.createmode.factorymethod.abstractfactory
 */
public class FemaleFactory implements HumanFactory {
    @Override
    public Human getNewInstance(){
        return new Female();
    }
}
