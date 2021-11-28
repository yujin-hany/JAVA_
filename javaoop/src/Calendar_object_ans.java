import java.util.Calendar;
import java.util.Scanner;

public class Calendar_object_ans {
	// ���� ���ϱ� �޽�带 ������!
	
	
	//������ �޽�� ������( Ŭ������� �����ؾ���)
	Calendar_object_ans() {
		myCalendar();
	}
	
	
	int getWeek(int year, int month) {
			Calendar date=Calendar.getInstance();
			date.set(year, month-1, 1);;
			int week=date.get(Calendar.DAY_OF_WEEK);
			return week;
	}
	
	// �������� ���ϱ� : ������ ���� �ʿ�
	int getLastDay( int year, int month) {
		int lastDay=31;
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			lastDay=30; //���⼭ return lastDay �ϸ� �ҽ� �м��ϱ� ���� return�� �׳� �������� ����
			break;
		case 2:
			if (year%400==0 || year%4==0 && year%100!=0) {
				lastDay=29;
			} else {
				lastDay=28;
			}
		}
		return lastDay;
	}
	
	// ���� ���
	void titlePrint(int year, int month) {
	System.out.println(" \t \t "+ year+"��"+month+"��");
	 System.out.println("�� \t�� \tȭ \t�� \t�� \t�� \t�� ");
	 System.out.println();
	}
	
	
	//��¥ ����ϱ� ���� 1���� ���ۿ� ���� ����ó��
	void spacePrint(int week) {
		for (int space=1; space<week; space++) {
			System.out.print("\t");
		}

	}
	
	
	// ��¥ ����ϱ� : ������ ���� ������ �־�� ��.
	void dayPrint(int lastDay, int week) {
		for (int day=1; day<=lastDay; day++) {
			System.out.print(day+"\t");
			if ((day+week-1) % 7 == 0) { //week=2 �� �������̶� ���� 1���� ��=> day+������ 7�� ����� �ٹٲٱ�
				System.out.println();
			}
		}
			
			}
	
	
	// ��� ���� ����
		boolean question() {
		 	Scanner scan=new Scanner(System.in);
			System.out.println("��� �Ͻðڽ��ϱ�? (y/n");
			String que= scan. nextLine();  // !!! enter�� ������ ���� �Է� !!! // == > STRING��.
			if (que.equals("y")) {    // ������ true=>�ݺ�
				return true;	
			}else {
				return false;
		}
		}	

		
	/// �޽���� ��� ���� ������ �޽�� => �Ϲ� �޽�带 �ϴµ� ���� ���� ������ �� ����.
	
		
	// �̰� ȣ���ϸ� ���� �޽�� ���� ���ʶ��� ���� �ǰ� �ݺ��Ǵ� �� 
	void myCalendar() { //��������� ���� ���� �� �����ڴ� �������� �޸� ���忡���� �δ��
		
		Gugudan gugu=new Gugudan();
		do {
			int y=gugu.consoleInput("�⵵");
			int m=gugu.consoleInput("��");
			int w=getWeek(y,m);
			int lastDay=getLastDay(y,m);
			
			titlePrint(y,m); //����
			spacePrint(w);
			dayPrint(lastDay,w); // �׳� dayPrint(getLastDay(y,m),w) �̷��� �ص� ��. (lastday�� �ѹ��� ��)
		} while(question()); // ���ϰ��� �Ҹ��̶� �׳� ������ ��.
	}
		
	// => ��ü ���� �� myCalendar �� ȣ�����ָ� �ָ����� �� ����.
	
	
	
	
}
