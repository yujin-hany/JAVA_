

// ���� �ζ� set 
import java.util.Scanner;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Random;

public class Lotterysetanswer {
	public static void main(String[] args) {
		Scanner scan=new Scanner( System.in);
		Random random=new Random();
		

		do {
			System.out.print("���Ӽ�");
			int gameCount=Integer.parseInt(scan.nextLine());
			
		 //���� �� ��ŭ �ݺ�
			for (int cnt=1; cnt<=gameCount; cnt++) {
				// �ϳ��� ���� �����
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


//���� �Ѱ� ����� ���� ���� ����ŭ �ݺ��ؼ� ��.
////��ȣ ����=> �迭 0���� ���=>�ߺ��˻� �� ��� ����=> ��ȣ ����=>1���� ���=> 0��°�� 1��°�� �ߺ�Ȯ��
/// => �ߺ� �� ���� �ֱٿ� ������� ��ȣ�� ����=> 

//������ ���ʽ� �����ؼ� �ϸ� ��( �̰� �ε��� �����ؼ� ����) => ���� ����  
