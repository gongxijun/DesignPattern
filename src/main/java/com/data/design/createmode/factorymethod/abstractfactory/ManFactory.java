package com.data.design.createmode.factorymethod.abstractfactory;

/**
 * @Author XiJun.Gong
 * @DATE 2017/2/22.
 * aim:   com.data.design.createmode.factorymethod.simplefactorypattern
 */
public class ManFactory implements HumanFactory {
    @Override
    public Human getNewInstance() {
        return new Man();
    }

}
