package 스터디예제9;

public class Solution {
		 public int solution(int[] sides) {
		        int a = sides[0];
		        int b = sides[1];
		        int c = sides[2];

		        if (a + b > c && a + c > b && b + c > a) {
		            return 2; // 삼각형이 가능한 경우
		        } else {
		            return 1; // 삼각형이 불가능한 경우
		        }
		    }
	    }

//가장 긴 변의 길이가 다른 두변의 길이 합보다 작아야 한다. 
