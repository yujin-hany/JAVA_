import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorMain {
	
	public VectorMain( ) {}
	
	public void start() {
		 // VectorTest �����;� ��.
			VectorTest vt=new VectorTest();
			
			// �ε����� ����
			// ��ü�� ������ ���͵� ��ü�� �������� ����
			// �÷��� �� ��ü ������ ������ �������� �ֵ� ����.
			
			
			// ���Ͱ� ���ϵǴϱ� ���ͷ� �����ؾ� ��.
			Vector v=vt.getData();
			
			// ��ü�� ���� ���ϱ�
			System.out.println("��ü ��"
					+ "->"+v.size());
			
			// �ٵ� �̰� object���� �� �ֱ� ������ ������
			// �� ��ȯ�� ����� ��.
			// 0��° ��ü ������ ���ͼ� � Ŭ�������� �˷���� ��.
			
			// MmeberVo�� private�̶� getNum () �̷��� �޽�� �����.
			MemberVO vo=(MemberVO) v.get(0);  
			System.out.println(vo.getNum()+','+vo.getUserName()+','+vo.getTel());
	
			String txt=(String)v.get(1);
			System.out.println("Txt->"+txt);
			
			Random r=(Random)v.get(2);
			System.out.println("Random->"+r);
			
			Calendar c=(Calendar) v.get(3);
			System.out.println("Calendar->"+c); // �̷��� �ϸ� �ش� ��¥ ���� �� ����
			
			SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd");
			System.out.println(fmt.format(c.getTime()));
			
			
			// �ƴϸ� int d=(Integer)v.get(4);�� ����
			int d=(int)v.get(4);  // ���� int �ε� vector�� �־ object�� ����Ǿ��⿡
			//�ٽ� int�� int�� �� ��ȯ ���־�� ��.
			System.out.println("d->"+d);
			
			
			// ���ʸ� ���� ����ϱ� :vt�� VectorTest�� ��ü
			Vector<MemberVO> list =vt.getMember();
			
			// => ���� Ŭ������ ������� �ش� Ŭ������ �����°Ŵϱ�
			//�׳� for������ �� �ȴ�
			
			for (int i=0; i<list.size(); i++) {
				
				MemberVO vecVo=list.get(i); // 0,1,2,3,4 ��° ��ü�� �ָ��� ����
				// ���ʸ��̶� �� ��ȯ�� �ʿ� ����.
				
				//System.out.println(vecVo.getNum()+','+vecVo.getUserName()+','+vecVo.getTel());
				System.out.println(vecVo.toString());
			}
	}

	public static void main(String[] args) {
		VectorMain vm= new VectorMain();
		vm.start();
	}

}










