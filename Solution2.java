package ���͵���9;
/*
 * 
 * import java.util.Arrays;

	class Solution {
    public int solution(int[] array, int n) {
        return (int) Arrays.stream(array)  // �迭�� ��Ʈ������ ��ȯ
        .filter(num -> num == n)  // n�� ���� ���Ҹ� �ɷ���
        .count();  // �ɷ��� ������ ������ ��ȯ
    }
}
 * ��Ʈ������ Ǯ �� �ִ�. 
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

