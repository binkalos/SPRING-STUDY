package polymorphism;

public class SamsungTV implements TV{
	
	public void powerOn() {
		System.out.println("samsunTV ON");
	}
	public void powerOFF() {
		System.out.println("samsungTV OFF");
	}
	public void volumeUp() {
		System.out.println("sound up");
	}
	public void volumeDown() {
		System.out.println("sound down");
	}

}
