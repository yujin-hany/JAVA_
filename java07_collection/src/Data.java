import java.util.ArrayList;
import java.util.List;


public class Data {

	public  List <MemberVO> getMember() { // ������ arraylist�� �ϸ� ����
		// ����Ʈ�� ������ ���⿡ ��ü ��Ҵµ� �ٽ� �� ������ arraylist�� ���� �� ����.
		MemberVO vo1=new MemberVO (100, "�ڱ浿","010-1234-5678");
		MemberVO vo2=new MemberVO (100, "�״���","010-4564-5678");
		MemberVO vo3=new MemberVO (100, "����","010-9823-5678");
		MemberVO vo4=new MemberVO (100, "ī����","010-1234-6519");
		
		//ArrayList : Ŭ���� - ���⿡�� ���ʸ� �״�� ��� ������.
		//List : ArrayList�� ���� �߻�Ŭ������ �̷��� �� �� ����
		// ==> ���� ������� arraylist�� list�� ����
		
		List <MemberVO>  lst=new ArrayList<MemberVO>() ;
		lst.add(vo1);
		lst.add(vo2);
		lst.add(vo3);
		lst.add(vo4);
		
		
		//SET�� �̿��Ͽ� ������ ���� �� ADD �� �޸� 1��° �� �����
		lst.set(1, new MemberVO(1000, "�����","010-5424-5652"));
		return lst;
		
	}
}
