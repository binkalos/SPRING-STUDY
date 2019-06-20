package perform;

public class Spring implements Poem{
	private static String[] LINES= {
			"하늘을 우러러 한 점 부끄러움 없기를",
			"잎새에 이는 바람에도 나는 괴로워 했다..."
	};
	
	public Spring() {
		//기본생성자
	}
	
	@Override
	public void recite() {
		for(int i = 0;i<LINES.length;i++) {
			System.out.println(LINES[i]);
		}
		
	}

}
