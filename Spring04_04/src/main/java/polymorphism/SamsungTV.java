package polymorphism;

import org.springframework.stereotype.Component;

@Component("tv1")
public class SamsungTV implements TV{
	
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {//객체 생성안했으므로 default생성자 호출됨
		System.out.println("samsung객체 생성(1)");
	}
	/*public SamsungTV(Speaker speaker,int price) {//매개변수가 있는 객체 xml가서 매개변수한개인 객체 호출하면 이것이 호출
		System.out.println("samsung객체 생성(2)");
		this.speaker = speaker;
		this.price = price;
	}*/
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker() 호출");
		this.speaker = speaker;
	}
	/*public void setPrice(int price) {
		System.out.println("setPrice() 호출");
		this.price = price;
	}*/
	public void powerOn() {
		System.out.print("samsunTV ON ");
		System.out.println("price" + price);
	}
	public void powerOFF() {
		System.out.println("samsungTV OFF");
	}
	public void volumeUp() {
		speaker.volumeUp();
		//System.out.println("sound up");
	}
	public void volumeDown() {
		speaker.volumeDown();
		//System.out.println("sound down");
	}

}
