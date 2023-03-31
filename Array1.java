package 스터디예제4;

public class Array1 {
	public static void main(String[] args) {
		char[] Arr = new char[26];
		char ch = 'A';			//왜 B부터 나올까? 
				
		for(int i=0; i<Arr.length; i++) {
			Arr[i] = ++ch;		//ch 변수에 저장된 값에다 +1을 더함. a 다음에는 b가 온다. 
		
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




////위 코드는 26개의 문자를 저장할 수 있는 char 타입의 배열 charArr을 선언하고, 알파벳 대문자 'A'부터 시작하여 배열에 저장하는 예제 코드입니다.
//
//먼저, charArr 배열을 선언하고, 변수 ch에 대문자 'A'를 대입합니다. 그리고 for문을 사용하여 배열의 각 인덱스에 ch 변수에 저장된 값을 증가시키면서 저장합니다. 이때, charArr[i] = ++ch; 코드를 사용하여 ch 변수의 값을 1 증가시키면서 해당 값을 배열에 저장합니다.
//
//그리고 마지막으로 for문을 사용하여 배열에 저장된 문자와 해당 문자의 아스키 코드 값을 출력합니다. 이때 System.out.println(charArr[i] +","+(int)charArr[i]); 코드를 사용하여 문자와 아스키 코드 값을 쉼표로 구분하여 출력합니다.
//
//따라서, 위 코드를 실행하면 알파벳 대문자 'B'부터 'Z'까지의 문자와 해당 문자의 아스키 코드 값이 출력됩니다.