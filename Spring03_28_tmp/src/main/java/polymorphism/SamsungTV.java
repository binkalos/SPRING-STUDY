package polymorphism;

public class SamsungTV implements TV{
	
	private SonySpeaker speaker;
	
	public void powerOn() {
		System.out.println("samsunTV ON");
	}
	public void powerOFF() {
		System.out.println("samsungTV OFF");
	}
	public void volumeUp() {
		speaker = new SonySpeaker();
		speaker.volumeup();
		//System.out.println("sound up");
	}
	public void volumeDown() {
		speaker = new SonySpeaker();
		speaker.volumedown();
		//System.out.println("sound down");
	}

}
