package beans;

import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest extends TestCase {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
    Person person = (Person) context.getBean("person");
}