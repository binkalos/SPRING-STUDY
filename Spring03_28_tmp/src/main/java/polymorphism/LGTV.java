package polymorphism;

public class LGTV implements TV{
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
}
