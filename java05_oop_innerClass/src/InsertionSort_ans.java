import java.util.Arrays;
import java.util.Random;

public class InsertionSort_ans{

	public static void main(String[] args) {
		Random random=new Random();
		
		int data[]=new int[10];
		
		for (int i=0; i<data.length; i++) {
			data[i]=random.nextInt(100)+1; // [1,20]
		}
		System.out.println("정렬전="+Arrays.toString(data));
		
		
		
		// 0번째를 제외한 1번째가 첫 기준점이 되어야 하고 length 끝까지 가야함.
		int k;
		for ( int i=1; i<data.length; i++) {
			int pointData=data[i]; // 일단 i 번째 값 옮기기
			// k+1에 에 pointData를 넣어준다
			for ( k= i-1; k>=0  && pointData<data[k]; k--) { // i 기준 왼쪽을 확인
				// k 기준 하나식 줄여간다
				//data[k] 가 pointdata보다 작으면 멈춰야 함
				data[k+1]=data[k];
				
			
			}
			data[k+1]=pointData;    // 여기서 k 못써서 그냥 글로벌 변수로 가져옴.
			}
		System.out.println("정렬 후="+Arrays.toString(data));
	}
	
	

}
