package com.data.design.structuremode.adaptermode;

/**
 * @Author XiJun.Gong
 * @DATE 2017/2/24.
 * aim:   com.data.design.structuremode.adaptermode
 */
public class App {
    public static void main(String[] args){
        Action command = new AdapterSoldier();
        command.attack();
        command.defense();
    }
}
