package polymorphism;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVuser {
	public static void main(String[] args) {
		
		//1.spring 컨테이너를 구동시킨다.
		ApplicationContext ctx = new GenericXmlApplicationContext("config,xml.xml");
		//2.spring컨테이너로부터 객체를 요청한다.
		TV tv = (TV)ctx.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOFF();
		//3.spring컨테이너를 종료한다.
		
		/*
		 * BeanFactory factory = new BeanFactory(); TV tv=(TV)factory.getBean(args[0]);
		 * 
		 * tv.powerOn(); tv.volumeUp(); tv.volumeDown(); tv.powerOFF();
		 */
	}
}
