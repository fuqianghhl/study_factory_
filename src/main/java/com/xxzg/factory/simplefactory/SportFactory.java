package com.xxzg.factory.simplefactory;

import com.xxzg.factory.ISport;

/**
 * Created by fsj on 2019-3-12
 */
public class SportFactory {

    public ISport sport(Class clazz){
        try{
            if( null !=clazz){
                return (ISport) clazz.newInstance();
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
