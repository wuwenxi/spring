package com.wwx.spring.beans.factorybean;

import org.springframework.beans.factory.FactoryBean;



/**
 *
 *   使用FactoryBean来创建bean实例
 *
 * */
public class MyFactoryCarBean implements FactoryBean<Car> {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     *
     *   创建一个新对象 并将其返回
     *
     * */
    public Car getObject() throws Exception {
        return new Car(name,300000);
    }


    /**
     *
     *      返回需要创建实例的类
     *
     *
     * */
    public Class<?> getObjectType() {
        return Car.class;
    }

    /**
     *
     *  是否是单例
     *
     * */
    public boolean isSingleton() {
        return true;
    }
}
