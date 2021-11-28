import java.util.Calendar;
import java.util.Scanner;

public class Calendar_object_ans {
	// 요일 구하기 메쏘드를 만들자!
	
	
	//생성자 메쏘드 만들자( 클래스명과 동일해야함)
	Calendar_object_ans() {
		myCalendar();
	}
	
	
	int getWeek(int year, int month) {
			Calendar date=Calendar.getInstance();
			date.set(year, month-1, 1);;
			int week=date.get(Calendar.DAY_OF_WEEK);
			return week;
	}
	
	// 마지막날 구하기 : 연도와 월이 필요
	int getLastDay( int year, int month) {
		int lastDay=31;
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			lastDay=30; //여기서 return lastDay 하면 소스 분석하기 힘들어서 return은 그냥 마지막에 하자
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
	
	// 제목 찍기
	void titlePrint(int year, int month) {
	System.out.println(" \t \t "+ year+"년"+month+"월");
	 System.out.println("일 \t월 \t화 \t수 \t목 \t금 \t토 ");
	 System.out.println();
	}
	
	
	//날짜 출력하기 전에 1일의 시작에 따라 공백처리
	void spacePrint(int week) {
		for (int space=1; space<week; space++) {
			System.out.print("\t");
		}

	}
	
	
	// 날짜 출력하기 : 마지막 날과 요일이 있어야 함.
	void dayPrint(int lastDay, int week) {
		for (int day=1; day<=lastDay; day++) {
			System.out.print(day+"\t");
			if ((day+week-1) % 7 == 0) { //week=2 는 월요일이라 공백 1개인 것=> day+공백이 7의 배수면 줄바꾸기
				System.out.println();
			}
		}
			
			}
	
	
	// 계속 여부 묻기
		boolean question() {
		 	Scanner scan=new Scanner(System.in);
			System.out.println("계속 하시겠습니까? (y/n");
			String que= scan. nextLine();  // !!! enter를 포함한 문자 입력 !!! // == > STRING임.
			if (que.equals("y")) {    // 같으면 true=>반복
				return true;	
			}else {
				return false;
		}
		}	

		
	/// 메쏘드의 경우 보통 생성자 메쏘드 => 일반 메쏘드를 하는데 딱히 순서 정해진 건 없음.
	
		
	// 이거 호출하면 위의 메쏘드 들이 차례때로 구현 되고 반복되는 것 
	void myCalendar() { //멤버변수에 변수 선언 시 개발자는 편하지만 메모리 입장에서는 부담됨
		
		Gugudan gugu=new Gugudan();
		do {
			int y=gugu.consoleInput("년도");
			int m=gugu.consoleInput("월");
			int w=getWeek(y,m);
			int lastDay=getLastDay(y,m);
			
			titlePrint(y,m); //제목
			spacePrint(w);
			dayPrint(lastDay,w); // 그냥 dayPrint(getLastDay(y,m),w) 이렇게 해도 됨. (lastday는 한번만 씀)
		} while(question()); // 리턴값이 불린이라 그냥 넣으면 됨.
	}
		
	// => 객체 생성 후 myCalendar 만 호출해주면 주르르륵 다 나옴.
	
	
	
	
}
