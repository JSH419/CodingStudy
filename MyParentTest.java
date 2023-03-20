package hello2;

class MyParent {
	private 	int prv;	//같은 클래스
				int dft;	//같은 패키지
	protected	int prt;	//같은 패키지 + 자손(다른 패키지)
	public 		int pub;	//접근 제한 없음.
	
	public void printMember() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}

public class MyParentTest {
	public static void main(String[] args) {
		MyParent a = new MyParent();
		
		System.out.println(a.prv);	// private는 다른 클래스에서 사용 불가능하다. 
		System.out.println(a.dft);
		System.out.println(a.prt);
		System.out.println(a.pub);
	}
}
