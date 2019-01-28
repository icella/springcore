package cn.javass.spring.chapter6.service.impl;

import cn.javass.spring.chapter6.service.IIntroductionService;

/**
 * Created on 2019-01-28
 *
 * @author lla
 */
public class IntroductionService implements IIntroductionService {
    @Override
    public void induct() {
        System.out.println("============introduction");
    }
}
