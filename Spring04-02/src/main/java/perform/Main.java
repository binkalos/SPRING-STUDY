package perform;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("config.xml");
		performer performer = (performer)ctx.getBean("poeticLKB");
		performer.perform();

	}

}
