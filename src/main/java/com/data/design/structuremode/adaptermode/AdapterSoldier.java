package com.data.design.structuremode.adaptermode;

/**
 * @Author XiJun.Gong
 * @DATE 2017/2/24.
 * aim:   com.data.design.structuremode.adaptermode
 */
public class AdapterSoldier extends Command implements Action {

    @Override
    public void defense() {
        System.out.println("防御~");
    }
}
