package polymorphism;

public class SonySpeaker implements Speaker{
	public SonySpeaker() {
		System.out.println("sony speaker객체 생성");
	}
	@Override
	public void volumeUp() {
		System.out.println("sony speaker volumeup");
		
	}
	@Override
	public void volumeDown() {
		System.out.println("sony speaker volumedown");
		
	}
}
