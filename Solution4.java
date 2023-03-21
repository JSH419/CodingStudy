package 스터디예제9;

public class Solution4 {
	 public int solution(int num1, int num2) {
	     int answer = 0;   
		 if(num2 == 0) {
	        	System.out.println("0으로 나눌 수 없음");
	        	return 0;
	        }
	        answer = num1 / num2;
	        return answer;
	    }
}
