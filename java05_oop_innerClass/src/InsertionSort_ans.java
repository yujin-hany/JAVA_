import java.util.Arrays;
import java.util.Random;

public class InsertionSort_ans{

	public static void main(String[] args) {
		Random random=new Random();
		
		int data[]=new int[10];
		
		for (int i=0; i<data.length; i++) {
			data[i]=random.nextInt(100)+1; // [1,20]
		}
		System.out.println("������="+Arrays.toString(data));
		
		
		
		// 0��°�� ������ 1��°�� ù �������� �Ǿ�� �ϰ� length ������ ������.
		int k;
		for ( int i=1; i<data.length; i++) {
			int pointData=data[i]; // �ϴ� i ��° �� �ű��
			// k+1�� �� pointData�� �־��ش�
			for ( k= i-1; k>=0  && pointData<data[k]; k--) { // i ���� ������ Ȯ��
				// k ���� �ϳ��� �ٿ�����
				//data[k] �� pointdata���� ������ ����� ��
				data[k+1]=data[k];
				
			
			}
			data[k+1]=pointData;    // ���⼭ k ���Ἥ �׳� �۷ι� ������ ������.
			}
		System.out.println("���� ��="+Arrays.toString(data));
	}
	
	

}
