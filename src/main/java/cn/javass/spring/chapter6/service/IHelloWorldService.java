package cn.javass.spring.chapter6.service;

/**
 * Created on 2019-01-28
 *
 * @author lla
 */
public interface IHelloWorldService {
    void sayHello();

    void sayBefore(String param);

    boolean sayAfterReturning();

    void sayAfterThrowing();

    boolean sayAfterFinally();

    void sayAround(String param);

    void sayAdvisorBefore(String param);
}
