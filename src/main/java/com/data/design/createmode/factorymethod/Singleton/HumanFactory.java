package com.data.design.createmode.factorymethod.Singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author XiJun.Gong
 * @DATE 2017/2/22.
 * aim:   com.data.design.createmode.factorymethod.Singleton
 */
public class HumanFactory {
    /*这里先不考虑线程安全问题*/
    static final Map<String ,Class> map= new HashMap<String,Class>();
    static {
        map.put("Female",Female.class);
        map.put("Man",Man.class);
    }
    public Human create(String sexType) throws IllegalAccessException, InstantiationException {
        if(!map.containsKey(sexType))
            System.out.println("输入类型错误.");
        return (Human) map.get(sexType).newInstance();
    }
}
