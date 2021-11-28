
import java.util.Scanner;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Random;

public class Lotteryanswer {
	public static void main(String[] args) {
		Scanner scan=new Scanner( System.in);
		Random random=new Random();
		
		
		//treeset 에 넣으면 자동으로 오름차순에다가 정렬은 오름차순이라 이거 하는게 제일 좋을듯
		do {
			
			System.out.print("게임수");
			int gameCount=Integer.parseInt(scan.nextLine());
			
		 //게임 수 만큼 반복
			for (int cnt=1; cnt<=gameCount; cnt++) {
				// 하나의 게임 만들기
				int j=0;
				//게임 생성
				//1게임을 저장할 배열을 생성
				int lotto[]=new int[7];
				//for (int i=0; i< lotto.length; i++) {//lotto.length=7
					//lotto[i]=random.nextInt(45)+1;
					
				//}
					
				
				
				// set에 6개가 들어갈 때까지 반복해서 뽑기
				// 해당 번호를 출력
				
				// => unique 한 6개 뽑히고 이게 set에 들어갈 때까지
				// 그 후에 set에 하나 더 뽑아서 넣는다. 이렇게 해아하는 것
				
				// 아니면 많이 뽑아서 set에 넣어두고 7개를 출력?
				// 사이즈 이용하면 가능흔 할 것 같음.
				TreeSet<Integer> numet=new TreeSet<Integer>();
				TreeSet<Integer> nume=new TreeSet<Integer>();
				
				while (numet.size()<6) {
					
					int i=random.nextInt(45)+1;
					numet.add(i);
					nume.add(i);
					
				}
				 
				//int i=random.nextInt(45)+1;
				//nume.add(i);
				
				
				while (nume.size()!=7) {
					 j=random.nextInt(45)+1;
					nume.add(j);
					
					
				}
				
				
				// 보너스를 뽑고 set에 넣으면 기존 set으 순서가 달라짐
				// => set을 만든 후 set을 복사해서
				// 개수를 체크하기
				
				
				Iterator<Integer> getStrDat=numet.iterator();
				while(getStrDat.hasNext()) {
					System.out.print(getStrDat.next()+"\t");
					
				
				}
				System.out.print("bonus="+j);
				System.out.println();
				}
			//	System.out.println();
				
				
				
				
					
					/*
					//중복 검사하기 with 지금까지 만들어진 번호
					for (int check=0; check<i; check++){  //이렇게 하면 0에서는 비교 안함.
						
						if (lotto[i]==lotto[check]) {
							i--;
						}
						                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
					}					
				}
				
				
				
				//정렬  : 보너스 번호 제외하기 위함.
				for (int idx=0; idx<lotto.length-2; idx++ ) {//0,1,2,3,4,
					for ( int j=0; j<lotto.length-2-idx; j++) { //
						if (lotto[j]> lotto[j+1]) {
							int temp=lotto[j];
							lotto[j]=lotto[j+1];
							lotto[j+1]=temp;
							
						}
						
					}
					
					
				}
				
				
				// 출력
				System.out.print(cnt+"게임=[");
				
				for ( int i=0; i<lotto.length-1; i++) {
					System.out.print(lotto[i]);
					
					if (i<5) {
						System.out.print(", ");
	
					}
					else {
	  					System.out.print("], ");
	  				}
					
				}
				System.out.println("보너스=" + lotto[6]);
			}
			*/
		
			//}
		
		} while(true);
		
				
		
		
		
			
		
	}
			
}


//게임 한개 만드는 것을 게임 수만큼 반복해서 함.
////번호 생성=> 배열 0번에 담기=>중복검사 할 대상 없음=> 번호 생성=>1번에 담기=> 0번째랑 1번째랑 중복확인
/// => 중복 시 가장 최근에 만들어진 번호를 버림=> 

//정렬은 보너스 제외해서 하면 됨( 이건 인덱스 조절해서 가능) => 버블 정렬  
