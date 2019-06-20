package polymorphism;

public class mirimSpeaker implements Speaker{

		public mirimSpeaker() {
			System.out.println("mirim speaker객체 생성");
		}
		@Override
		public void volumeUp() {
			System.out.println("Mirim Speaker Sound Up");
			
		}

		@Override
		public void volumeDown() {
			System.out.println("Mirim Speaker Sound Down");
			
		}

}

