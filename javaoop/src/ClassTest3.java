
public class ClassTest3 {
	public static void main(String[] args) {
  
		
		
		ClassTest2 ct=new ClassTest2();   // => ClassTest2() {} �� �����.
		ct.sum();  //1-0������ ��:0
		
		ClassTest2 ct2=new ClassTest2(100); // => ClassTest2(int num) {} �� �����.
		 //num�� ����Ǵ� ���ȿ��� ����ֱ⿡ �̰� �ٸ� ������ �޾���� ��.
		ct2.sum();   //5050 ( 1-100������ ��)
		
		ClassTest2 ct3=new ClassTest2(200, "ȫ�浿");
		ct3.sum();
		
}
}