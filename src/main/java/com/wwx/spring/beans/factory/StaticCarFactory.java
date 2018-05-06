package com.wwx.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;



/**
 *
 *    静态工厂创建
 *
 *
 * */
public class StaticCarFactory {

    private static Map<String,Car> cars = new HashMap<String, Car>();

    static {
        cars.put("audi",new Car("audi",300000));
        cars.put("ford",new Car("ford",400000));
    }

    public static Car getCar(String name){
        return cars.get(name);
    }
}
