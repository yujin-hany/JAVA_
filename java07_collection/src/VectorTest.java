import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorTest {
	
	public  Vector getData() { // ���� Ÿ���� ���ͷ�
		
		MemberVO vo=new MemberVO(200,"ȫ�浿","010-4799-9356");
		
		
		// ���� �������� �� default �� ��
		Random random=new Random();
		Calendar date=Calendar.getInstance();
		date.set(2020,10,30);
		
		String str="�������"; // ��Ʈ�� ��ü
		int intData=1234;
		
		// ������ Ÿ���� �޶� �÷��� ��� ��.
		// ������ Ÿ�� �ٸ��ϱ� generic  ��� �Ұ��� => <E> ���� ��
		
		Vector v= new Vector();
		System.out.println("capacity"+v.capacity());
		
		
		// vector�� ��ü  �߰��ϱ�
		v.add(vo);  //0 th
		v.addElement(random);//2th
		v.add(date); //3th
		v.add(1, str); //1th
		v.addElement(intData);  //4th
		
		return v;
		
	}
	
	
	// ���� Ŭ�������� ���� ��ü�� ���Ϳ� Ŭ���� �����Ͽ� �־��==> ���ʸ��� �� �� ����
	//=> gereric ���� �� ������ ��ü �ۿ� ������.
	// => �̰� ���� �׳� �ְ� ���� �� ��ȯ ���ϰ� ���� �� ����~
	
	public  Vector<MemberVO> getMember() { //��ȯ���� ����+���ʸ� �־��־�� ��.
		MemberVO vo1=new MemberVO (100, "�ڱ浿","010-1234-5678");
		MemberVO vo2=new MemberVO (100, "�״���","010-4564-5678");
		MemberVO vo3=new MemberVO (100, "����","010-9823-5678");
		MemberVO vo4=new MemberVO (100, "ī����","010-1234-6519");
		
		// MmeberVO �� ���� �� �ִ� ���ʹ�
		Vector  <MemberVO>  v=new Vector <MemberVO> ();
		v.add(vo1);
		v.add(vo2);
		v.add(vo3);
		v.add(vo4);
		//v.add(new Random());  : �̰� ������ since it's not MemberVO INSTANCE
		
		return v;
		
	}
	


}
