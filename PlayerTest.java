abstract class Player {				//�߻� Ŭ����(�̿ϼ� Ŭ����, �̿ϼ� ���赵) 
	abstract void play(int pos);	//�߻� �޼���(�̿ϼ� �޼���)
	abstract void stop();			//�߻� �޼��� (����θ� �ְ� ������{}�� ���� �޼���  
}

		//�߻�Ŭ������  ����� ���� �ϼ��ؾ� ��ü ������ ������ 
class AudioPlayer extends Player {
	void play(int pos) {System.out.println(pos+"��ġ���� �����մϴ�.");};
	void stop() {System.out.println("������ ����ϴ�.");};
}

public class PlayerTest {
	public static void main(String[] args) {
		//player p = new Player();	//�߻� Ŭ������ ��ü ���� 
		//AudioPlayer ap = new AudioPlayer();
		Player ap = new AudioPlayer();		//�������� �ٲ㵵 �۵��� �ȴ�. ������ 
		ap.play(100); 	 
		ap.stop(); 
	}
}
