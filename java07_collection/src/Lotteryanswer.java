
import java.util.Scanner;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Random;

public class Lotteryanswer {
	public static void main(String[] args) {
		Scanner scan=new Scanner( System.in);
		Random random=new Random();
		
		
		//treeset �� ������ �ڵ����� �����������ٰ� ������ ���������̶� �̰� �ϴ°� ���� ������
		do {
			
			System.out.print("���Ӽ�");
			int gameCount=Integer.parseInt(scan.nextLine());
			
		 //���� �� ��ŭ �ݺ�
			for (int cnt=1; cnt<=gameCount; cnt++) {
				// �ϳ��� ���� �����
				int j=0;
				//���� ����
				//1������ ������ �迭�� ����
				int lotto[]=new int[7];
				//for (int i=0; i< lotto.length; i++) {//lotto.length=7
					//lotto[i]=random.nextInt(45)+1;
					
				//}
					
				
				
				// set�� 6���� �� ������ �ݺ��ؼ� �̱�
				// �ش� ��ȣ�� ���
				
				// => unique �� 6�� ������ �̰� set�� �� ������
				// �� �Ŀ� set�� �ϳ� �� �̾Ƽ� �ִ´�. �̷��� �ؾ��ϴ� ��
				
				// �ƴϸ� ���� �̾Ƽ� set�� �־�ΰ� 7���� ���?
				// ������ �̿��ϸ� ������ �� �� ����.
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
				
				
				// ���ʽ��� �̰� set�� ������ ���� set�� ������ �޶���
				// => set�� ���� �� set�� �����ؼ�
				// ������ üũ�ϱ�
				
				
				Iterator<Integer> getStrDat=numet.iterator();
				while(getStrDat.hasNext()) {
					System.out.print(getStrDat.next()+"\t");
					
				
				}
				System.out.print("bonus="+j);
				System.out.println();
				}
			//	System.out.println();
				
				
				
				
					
					/*
					//�ߺ� �˻��ϱ� with ���ݱ��� ������� ��ȣ
					for (int check=0; check<i; check++){  //�̷��� �ϸ� 0������ �� ����.
						
						if (lotto[i]==lotto[check]) {
							i--;
						}
						                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
					}					
				}
				
				
				
				//����  : ���ʽ� ��ȣ �����ϱ� ����.
				for (int idx=0; idx<lotto.length-2; idx++ ) {//0,1,2,3,4,
					for ( int j=0; j<lotto.length-2-idx; j++) { //
						if (lotto[j]> lotto[j+1]) {
							int temp=lotto[j];
							lotto[j]=lotto[j+1];
							lotto[j+1]=temp;
							
						}
						
					}
					
					
				}
				
				
				// ���
				System.out.print(cnt+"����=[");
				
				for ( int i=0; i<lotto.length-1; i++) {
					System.out.print(lotto[i]);
					
					if (i<5) {
						System.out.print(", ");
	
					}
					else {
	  					System.out.print("], ");
	  				}
					
				}
				System.out.println("���ʽ�=" + lotto[6]);
			}
			*/
		
			//}
		
		} while(true);
		
				
		
		
		
			
		
	}
			
}


//���� �Ѱ� ����� ���� ���� ����ŭ �ݺ��ؼ� ��.
////��ȣ ����=> �迭 0���� ���=>�ߺ��˻� �� ��� ����=> ��ȣ ����=>1���� ���=> 0��°�� 1��°�� �ߺ�Ȯ��
/// => �ߺ� �� ���� �ֱٿ� ������� ��ȣ�� ����=> 

//������ ���ʽ� �����ؼ� �ϸ� ��( �̰� �ε��� �����ؼ� ����) => ���� ����  
