
class Ex3_2 {
	public static void main(String[] args) {
		int i=5, j=0;
		
		j = i++;	//���� ������ �Ŀ� ������Ų��.
		System.out.println("j=i++, ���� ��, i="+ i +", j="+ j);
		
		i=5;
		j=0;
		
		j= ++i; 	//���� �����Ǳ� ���� ������Ų��. 
		System.out.println("j=++i; ���� ��, i=" +i +", j="+ j);
		
		i=5;
		j=5;
		
		System.out.println(i++);	//i ����ϰ� 1���� 
		System.out.println(++j);	//j ����ϱ� �� 1���� 
		System.out.println("i = " + i + ", j = " +j);
	}
}
