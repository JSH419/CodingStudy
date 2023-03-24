package 배열;

import java.util.Arrays;

class Ex5_4 {
	public static void main(String[] args) {
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));	//그대로 출력됨.
		
		for (int i=0; i < 100; i++) { //100번 섞어라. 
			int n = (int)(Math.random()* 10); //0~9중 임의의 값을 얻는다. 
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));	//섞어서 출력됨.
	}
}
