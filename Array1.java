package ���͵���4;

public class Array1 {
	public static void main(String[] args) {
		char[] Arr = new char[26];
		char ch = 'A';			//�� B���� ���ñ�? 
				
		for(int i=0; i<Arr.length; i++) {
			Arr[i] = ++ch;		//ch ������ ����� ������ +1�� ����. a �������� b�� �´�. 
		
		}
		
		for(int i=0; i<Arr.length; i++) {
			System.out.println(Arr[i] +","+(int)Arr[i]);
		}
		System.out.println();
		
		for(char alpha : Arr) {
			System.out.println(alpha +", "+ (int)alpha);
		}
	}
}




////�� �ڵ�� 26���� ���ڸ� ������ �� �ִ� char Ÿ���� �迭 charArr�� �����ϰ�, ���ĺ� �빮�� 'A'���� �����Ͽ� �迭�� �����ϴ� ���� �ڵ��Դϴ�.
//
//����, charArr �迭�� �����ϰ�, ���� ch�� �빮�� 'A'�� �����մϴ�. �׸��� for���� ����Ͽ� �迭�� �� �ε����� ch ������ ����� ���� ������Ű�鼭 �����մϴ�. �̶�, charArr[i] = ++ch; �ڵ带 ����Ͽ� ch ������ ���� 1 ������Ű�鼭 �ش� ���� �迭�� �����մϴ�.
//
//�׸��� ���������� for���� ����Ͽ� �迭�� ����� ���ڿ� �ش� ������ �ƽ�Ű �ڵ� ���� ����մϴ�. �̶� System.out.println(charArr[i] +","+(int)charArr[i]); �ڵ带 ����Ͽ� ���ڿ� �ƽ�Ű �ڵ� ���� ��ǥ�� �����Ͽ� ����մϴ�.
//
//����, �� �ڵ带 �����ϸ� ���ĺ� �빮�� 'B'���� 'Z'������ ���ڿ� �ش� ������ �ƽ�Ű �ڵ� ���� ��µ˴ϴ�.