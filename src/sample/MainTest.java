package sample;

public class MainTest {

	public static void main(String[] args) {
		//spring에서 추가
		sampleVO vo = new sampleVO();
		
		//spring에서 추가한 내용1
		System.out.println("test");
		
		//git-hub에서 추가한 내용1
		System.out.println("git-hub");
		
		//spring에서 추가한 내용2
		System.out.println("test2");
		
		//git-hub에서 추가한 내용2
		System.out.println("git-hub2");
		
		//spring에서 추가한 내용3
		System.out.println("3번째로 " + vo.getSpring());
		
		//git-hub에서 추가한 내용3
		System.out.println("3번째로 " + vo.getGit());
	}

}
