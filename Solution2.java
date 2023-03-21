package 스터디예제9;
/*
 * 
 * import java.util.Arrays;

	class Solution {
    public int solution(int[] array, int n) {
        return (int) Arrays.stream(array)  // 배열을 스트림으로 변환
        .filter(num -> num == n)  // n과 같은 원소만 걸러냄
        .count();  // 걸러낸 원소의 개수를 반환
    }
}
 * 스트림으로 풀 수 있다. 
 */


public class Solution2 {
	public int solution(int[] array, int n) {
        int answer = 0;
        
        for(int num : array) {
        	if(num == n) {
        		answer++;
        	}
        }
        return answer;
    }
}

