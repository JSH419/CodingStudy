package hello2;

class MyParent {
	private 	int prv;	//���� Ŭ����
				int dft;	//���� ��Ű��
	protected	int prt;	//���� ��Ű�� + �ڼ�(�ٸ� ��Ű��)
	public 		int pub;	//���� ���� ����.
	
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
		
		System.out.println(a.prv);	// private�� �ٸ� Ŭ�������� ��� �Ұ����ϴ�. 
		System.out.println(a.dft);
		System.out.println(a.prt);
		System.out.println(a.pub);
	}
}
