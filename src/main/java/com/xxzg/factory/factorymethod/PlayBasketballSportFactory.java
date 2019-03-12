package com.xxzg.factory.factorymethod;

import com.xxzg.factory.ISport;
import com.xxzg.factory.PlayBasketballSport;

/**
 * Created by fsj on 2019-3-12
 */
public class PlayBasketballSportFactory implements ISportFactory {

    public ISport sport() {

        return new PlayBasketballSport();

    }
}
