package com.xxzg.factory.factorymethod;

import com.xxzg.factory.ISport;

/**
 * Created by fsj on 2019-3-12
 */
public class SportMethodTest {

    public static void main(String[] args) {

        ISportFactory iSportFactory =new PlayBasketballSportFactory();

        ISport iSport =iSportFactory.sport();

        iSport.sport();
    }
}
