import java.util.Calendar;
import java.util.Random;
import java.util.Vector;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FormatTest {

	public static void main(String[] args) {
		 // ��� ������ �̿��Ͽ� ������ ��ȯ�ϱ�
		// 1> ��¥
		Calendar c=Calendar.getInstance();
		
		//2021-11-26(��) 11:21:12 (����) : ���� �����
		SimpleDateFormat frm=new SimpleDateFormat("yyyy-MM-dd(E) hh:mm:ss a");
		
		// date ã�Ƽ� frm �� �־��־�� ��.
		//getTime�� date�� ã���ְ� ���⿡ format���� ���θ� string ���� ����
		
		String dateFrm=frm.format(c.getTime());
		System.out.println(dateFrm);
		
		
		//���� ������ ����
		//2354862->2,354,862�� �̷���! : �ڿ� ���� 3�ڸ����� , ��� �ڿ� ���� �ٿ���
		// # : ����
		int data=2354862;
		DecimalFormat fmt2=new DecimalFormat("#,###��"); // �̷��� �ϸ� ���ڰ� Ŀ���� 3�ڸ����� , ����
		String decimalData=fmt2.format(data); 
		//==> �̰� ��Ʈ���̶� ��� �Ұ��� (�׳� ǥ�� ����)
		// �츮�� ������ int�� format�ȿ��� long, double������ ���´ٰ� �Ǿ�������
		///������ int���� long, double�� ũ�ϱ� �׳� ������ ��
		System.out.println(decimalData);
		
		//����ȭ�� �����͸� ���� ������ ��ȯ�ϱ� : ���  �ʿ� ��
		// getInstance �̿��Ͽ� ��ü ����
		
		 try {
			NumberFormat nf=NumberFormat.getInstance();
			Number n=nf.parse(decimalData);  //  "," ����
			// �̰� Number Ŭ����
			
			// unhandled exception ����=> try -catch 
			// ���ڷ� ���ٲٴ� �������� ��� ������.
			int won=n.intValue();
			System.out.println("won->"+ won);
			
			 }catch(ParseException pe) {
				 System.out.println("���ڷ� ��ȯ���� ���Ͽ����ϴ�."+pe.getMessage());
			 }
		
		
	}

}
