package com.xxzg.factory.simplefactory;

import com.xxzg.factory.ISport;
import com.xxzg.factory.RunSport;

/**
 * Created by fsj on 2019-3-12
 * 简单工程模式测试
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

        SportFactory sportFactory =new SportFactory();

        ISport iSport =sportFactory.sport(RunSport.class);

        iSport.sport();
    }
}
