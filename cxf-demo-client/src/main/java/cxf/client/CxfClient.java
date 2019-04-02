package cxf.client;

import cxf.service.HelloService;
import cxf.service.po.School;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liyebing created on 16/12/4.
 * @version $Id$
 */
public class CxfClient {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:cxf-client.xml");
        HelloService client = (HelloService) context.getBean("helloClient");
        School school=client.sayHello("q213");
        System.out.println(school);
    }

}
