package com.data.design.createmode.factorymethod.factorymethodpattern;

/**
 * @Author XiJun.Gong
 * @DATE 2017/2/22.
 * aim:   com.data.design.createmode.factorymethod.simplefactorypattern
 */
public class HumanFactory {
  public Human newInstanceMan() throws IllegalAccessException, InstantiationException {
      return new Man();
  }
    public Human newInstanceFemale(){
        return new Female();
    }
}
