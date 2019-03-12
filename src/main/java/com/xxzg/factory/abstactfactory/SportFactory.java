package com.xxzg.factory.abstactfactory;

/**
 * Created by fsj on 2019-3-12
 */
public class SportFactory implements ISportFactory {


    public IPlayBasketBall sportPlay() {

        return new SportPlayBasketBall();

    }

    public IRun sportRun() {

        return new SportRun();

    }
}
