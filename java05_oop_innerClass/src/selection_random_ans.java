import java.util.Arrays;
import java.util.Random;
public class selection_random_ans {

	public static void main(String[] args) {
		
		Random ran=new Random();
		int data[]=new int[10];
		
		for (int i=0; i<data.length; i++) {
			data[i]=ran.nextInt(1000)+1001;
			
			
		}
		System.out.println("���� ��="+Arrays.toString(data));
		// toString �ϸ� arry�� string ����ؼ� [] �ȿ� �ϳ��� �־��� 
		
		
		
		
		for (int point=0; point<data.length; point++) {
			// ����� 0�̴�.
			int maxIndex=point; //���� ū ���� �ִ� �ε����� ������ ����
			
			// ����Ʈ�� �ִ� �����Ϳ� ����Ʈ ������ �ִ� �����͵� �� ���� ū ���� ���� �ε����� ���ؼ�
			//�̰� maxIndex�� �־��
			for ( int j=point+1; j<data.length; j++) {
				if (data[maxIndex] <data[j]) {
					maxIndex=j; //�ִ��� �ε����� ����������
				}

			}
			int temp=data[point];
			data[point]=data[maxIndex];
			data[maxIndex]=temp;
		
			
		}
	System.out.println("���� ��="+Arrays.toString(data));	
	}

}
