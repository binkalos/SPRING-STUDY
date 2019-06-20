package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
//xml코드에서 <bean id="tv" class="polymorphism.LGTV">와 같음
public class LGTV implements TV{
	@Autowired //=>소니 스피커와 연결하는 어노테이션
	@Qualifier("sony")//괄호에있는 특정애랑만 연결
	//의존성 주입될 객테의 아이디나 이름을 지정 할 수 있는데, sony,apple객체 중 딱 하나를 지정한 형태
	private Speaker speaker;
	public LGTV() {
		System.out.println("엘쥐객체 생성");
	}
	public void powerOn() {
		System.out.println("LGTV ON");
	}
	public void powerOFF() {
		System.out.println("LGTV OFF");
	}
	public void volumeUp() {
		System.out.println("sound up");
	}
	public void volumeDown() {
		System.out.println("sound down");
	}
	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker() 호출");
		this.speaker = speaker;
	}
}
