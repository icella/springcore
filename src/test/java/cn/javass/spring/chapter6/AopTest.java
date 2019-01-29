package cn.javass.spring.chapter6;

import cn.javass.spring.chapter6.service.IHelloWorldService;
import cn.javass.spring.chapter6.service.IIntroductionService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created on 2019-01-28
 *
 * @author lla
 */
public class AopTest {

    @Test
    public void testHelloWorld(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("chapter6/helloworld.xml");
        IHelloWorldService helloWorldService = ctx.getBean("helloWorldService", IHelloWorldService.class);
        helloWorldService.sayHello();
    }

    @Test
    public void testSchemaBeforeAdvice(){
        System.out.println("========================");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("chapter6/advice.xml");
        IHelloWorldService helloWorldService = ctx.getBean("helloWorldService", IHelloWorldService.class);
        helloWorldService.sayBefore("before");
        System.out.println("========================");
    }

    @Test
    public void testSchemaAfterReturningAdvice(){
        System.out.println("========================");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("chapter6/advice.xml");
        IHelloWorldService helloWorldService = ctx.getBean("helloWorldService", IHelloWorldService.class);
        helloWorldService.sayAfterReturning();
        System.out.println("========================");
    }

    @Test(expected = RuntimeException.class)
    public void testSchemaAfterThrowingAdvice(){
        System.out.println("========================");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("chapter6/advice.xml");
        IHelloWorldService helloWorldService = ctx.getBean("helloWorldService", IHelloWorldService.class);
        helloWorldService.sayAfterThrowing();
        System.out.println("========================");
    }

    @Test(expected = RuntimeException.class)
    public void testSchemaAfterFinallyAdvice(){
        System.out.println("========================");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("chapter6/advice.xml");
        IHelloWorldService helloWorldService = ctx.getBean("helloWorldService", IHelloWorldService.class);
        helloWorldService.sayAfterFinally();
        System.out.println("========================");
    }

    @Test
    public void testSchemaAroundAdvice(){
        System.out.println("========================");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("chapter6/advice.xml");
        IHelloWorldService helloWorldService = ctx.getBean("helloWorldService", IHelloWorldService.class);
        helloWorldService.sayAround("haha");
        System.out.println("========================");
    }

    @Test
    public void testSchemaIntroduction(){
        System.out.println("========================");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("chapter6/advice.xml");
        IIntroductionService introductionService = ctx.getBean("helloWorldService", IIntroductionService.class);
        introductionService.induct();
        System.out.println("========================");
    }

    @Test
    public void testSchemaAdvisor(){
        System.out.println("========================");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("chapter6/advice.xml");
        IHelloWorldService helloWorldService = ctx.getBean("helloWorldService", IHelloWorldService.class);
        helloWorldService.sayAdvisorBefore("haha");
        System.out.println("========================");
    }
}