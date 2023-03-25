
class Ex3_2 {
	public static void main(String[] args) {
		int i=5, j=0;
		
		j = i++;	//값이 참조된 후에 증가시킨다.
		System.out.println("j=i++, 실행 후, i="+ i +", j="+ j);
		
		i=5;
		j=0;
		
		j= ++i; 	//값이 참조되기 전에 증가시킨다. 
		System.out.println("j=++i; 실행 후, i=" +i +", j="+ j);
		
		i=5;
		j=5;
		
		System.out.println(i++);	//i 출력하고 1증가 
		System.out.println(++j);	//j 출력하기 전 1증가 
		System.out.println("i = " + i + ", j = " +j);
	}
}
