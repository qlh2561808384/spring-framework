import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: tinygray
 * @Description: 公众号:Madison龙少，关注我你会越来越优秀。
 * @className: IocTest
 * @create: 2022-08-28 02:43
 */
public class IocTest {

	@Test
	public void testIoc() {
		//ApplicationContext context = new AnnotationConfigApplicationContext("org.springframework.learning");
		//MyBean bean = context.getBean(MyBean.class);
		//System.out.println(bean);
		ApplicationContext context1 = new ClassPathXmlApplicationContext("spring.xml");
		Object myBean = context1.getBean("myBean");
		System.out.println(myBean);
	}
}
