package factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationConfig.xml");
        /**
         *
         *              静态工厂方法
        */
        Car car = (Car) ctx.getBean("factory");
        System.out.println(car);

        /**
         *
         *   实例工厂方法
         *
         */
        Car car1 = (Car) ctx.getBean("car");
        System.out.println(car1);
    }
}
