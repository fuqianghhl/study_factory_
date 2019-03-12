package com.xxzg.factory.factorymethod;

import com.xxzg.factory.ISport;
import com.xxzg.factory.SwimSport;

/**
 * Created by fsj on 2019-3-12
 */
public class SwimSportFactory implements ISportFactory {

    public ISport sport() {

        return new SwimSport();

    }
}
