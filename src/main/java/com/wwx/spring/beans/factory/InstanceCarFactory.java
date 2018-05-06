package com.wwx.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;


/**
 *
 *           实例工厂创建
 *
 *           不能使用静态static
 *
 */
public class InstanceCarFactory {

    private  Map<String,Car> cars = new HashMap<String, Car>();

    public InstanceCarFactory() {
        cars.put("audi",new Car("audi",300000));
        cars.put("ford",new Car("ford",400000));
    }

    public Car getCar(String name) {
        return cars.get(name);
    }
}
