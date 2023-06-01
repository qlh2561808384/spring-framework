package org.springframework.learning;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @Author: tinygray
 * @Description: 公众号:Madison龙少，关注我你会越来越优秀。
 * @className: MyBeanFactoryPostProcessor
 * @create: 2022-08-28 12:01
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	public MyBeanFactoryPostProcessor(){
		System.out.println("MyBeanFactoryPostProcessor 构造器。。。");
	}
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryPostProcessor 实现方法调用中。。。");
	}
}
