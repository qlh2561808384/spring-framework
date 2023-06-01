package org.springframework.learning;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @Author: tinygray
 * @Description: 公众号:Madison龙少，关注我你会越来越优秀。
 * @className: MyBean
 * @create: 2022-08-28 02:45
 */
@Component
public class MyBean implements InitializingBean {


	public MyBean(){
		System.out.println("MyBean构造器。。。");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("MyBean afterPropertiesSet 。。。");
	}
}
