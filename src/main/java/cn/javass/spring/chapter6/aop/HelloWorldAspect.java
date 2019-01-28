package cn.javass.spring.chapter6.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created on 2019-01-28
 *
 * @author lla
 */
public class HelloWorldAspect {

    //前置通知
    public void beforeAdvice(){
        System.out.println("================before advice");
    }

    //后置最终通知
    public void afterFinallyAdvice(){
        System.out.printf("================after finally advice");
    }

    //前置通知带参数
    public void beforeAdvice(String param){
        System.out.println("================before advice param:" + param);
    }

    public void sayAfterReturningAdvice(Object reVal){
        System.out.println("===============after running advice reVal:" + reVal);
    }

    public void afterThrowingAdvice(Exception exception){
        System.out.println("===============after throwing advice exception:" + exception);
    }

    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("===============around before advice");
        Object reVal = pjp.proceed(new Object[]{"replace"});
        System.out.println("===============around after advice");

        return reVal;
    }
}
