package ���͵���9;

public class Solution {
		 public int solution(int[] sides) {
		        int a = sides[0];
		        int b = sides[1];
		        int c = sides[2];

		        if (a + b > c && a + c > b && b + c > a) {
		            return 2; // �ﰢ���� ������ ���
		        } else {
		            return 1; // �ﰢ���� �Ұ����� ���
		        }
		    }
	    }

//���� �� ���� ���̰� �ٸ� �κ��� ���� �պ��� �۾ƾ� �Ѵ�. 
