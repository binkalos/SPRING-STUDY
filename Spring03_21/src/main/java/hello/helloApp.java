package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class helloApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("config.xml");
		MessageBeanInter hello = (MessageBeanInter) ctx.getBean("hello");
		hello.sayHello("spring");

	}

}
