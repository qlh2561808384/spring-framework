package org.springframework.learning;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author: tinygray
 * @Description: 公众号:Madison龙少，关注我你会越来越优秀。
 * @className: MyBeanPostProcessor
 * @create: 2022-08-28 12:01
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
	public MyBeanPostProcessor(){
		System.out.println("MyBeanPostProcessor 构造器。。。");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if ("myBean".equals(beanName)) {
			System.out.println("BeanPostProcessor实现类 postProcessBeforeInitialization方法调用中。。。");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ("myBean".equals(beanName)) {
			System.out.println("BeanPostProcessor实现类 postProcessAfterInitialization方法调用中。。。");
		}
		return bean;
	}
}
