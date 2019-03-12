package com.xxzg.factory.abstactfactory;

/**
 * Created by fsj on 2019-3-12
 */
public class AbstactFactoryTest {

    public static void main(String[] args) {

        ISportFactory iSportFactory =new SportFactory();

        iSportFactory.sportPlay().playBasketBall();

        iSportFactory.sportRun().run();

    }
}
