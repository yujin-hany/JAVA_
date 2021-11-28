

// 내꺼 로또 set 
import java.util.Scanner;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Random;

public class Lotterysetanswer {
	public static void main(String[] args) {
		Scanner scan=new Scanner( System.in);
		Random random=new Random();
		

		do {
			System.out.print("게임수");
			int gameCount=Integer.parseInt(scan.nextLine());
			
		 //게임 수 만큼 반복
			for (int cnt=1; cnt<=gameCount; cnt++) {
				// 하나의 게임 만들기
				int j=0;
				int lotto[]=new int[7];

				TreeSet<Integer> numet=new TreeSet<Integer>();
				TreeSet<Integer> nume=new TreeSet<Integer>();
				
				while (numet.size()<6) {
					int i=random.nextInt(45)+1;
					numet.add(i);
					nume.add(i);
				}
			
				while (nume.size()!=7) {
					 j=random.nextInt(45)+1;
					nume.add(j);		
				}
				Iterator<Integer> getStrDat=numet.iterator();
				while(getStrDat.hasNext()) {
					System.out.print(getStrDat.next()+"\t");
				}
				System.out.print("bonus="+j);
				System.out.println();
				}
	

		} while(true);
		

	}
			
}


//게임 한개 만드는 것을 게임 수만큼 반복해서 함.
////번호 생성=> 배열 0번에 담기=>중복검사 할 대상 없음=> 번호 생성=>1번에 담기=> 0번째랑 1번째랑 중복확인
/// => 중복 시 가장 최근에 만들어진 번호를 버림=> 

//정렬은 보너스 제외해서 하면 됨( 이건 인덱스 조절해서 가능) => 버블 정렬  
