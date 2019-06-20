package hello;

public class MessageBeanKr implements MessageBeanInter {

	@Override
	public void sayHello(String name) {
		System.out.println("안녕" + name);
		
	}

}
