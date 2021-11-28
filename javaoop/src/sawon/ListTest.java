package sawon;
// 패키지==폴더 내 ListTest가 있는 것으로 이거 위에 package 안하면 에러남.

import java.util.Scanner;
import java.util.Random;
import java.util.Calendar;


public class ListTest {
   // 멤버 영역 (Field 변수)
	
	int num=100;
	String name;
	
	double data=14.2;
	Scanner scan=new Scanner(System.in);
	
	static {
		// 실행문을 멤버 영역에서 처리할 때
	System.out.println("멤버영역에서 메소드 호출");
	}
	int result=(int) (num+data);
	
	//생성자 메쏘드 :Constructor method
	// 메쏘드명이 클래스명과 동일하며 반환형이 없음
	//생성자 메쏘드는 여러개 만들수 있음. (단, 매개변수의 개수 : () 안 혹은 데이터 형이 달라야함.)
	ListTest() { //이게 생성장 메쏘드
		System.out.println("ClassTest()...........");
	}
	
	ListTest(String n) {
		System.out.println("Why not?");
		
	}
	
	ListTest(int n,String name) {
		
		System.out.println("Please don't take test...");
	}
	
	
}
