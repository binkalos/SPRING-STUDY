package perform;

public class Poeticjugglier extends Juggler{
	private Poem poem;
	public Poeticjugglier() {
		
	}
	public Poeticjugglier(int beanBags,Poem poem) {
		super(beanBags);
		this.poem=poem;
	}
	public void perform() {
		super.perform();
		System.out.println("시를 읊으면서...");
		poem.recite();
	}
}
