package cn.javass.spring.chapter6.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created on 2019-01-29
 *
 * @author lla
 */
public class BeforeAdviceImpl implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("================before advice");
    }
}
