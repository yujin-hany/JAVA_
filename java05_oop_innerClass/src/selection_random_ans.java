import java.util.Arrays;
import java.util.Random;
public class selection_random_ans {

	public static void main(String[] args) {
		
		Random ran=new Random();
		int data[]=new int[10];
		
		for (int i=0; i<data.length; i++) {
			data[i]=ran.nextInt(1000)+1001;
			
			
		}
		System.out.println("정렬 전="+Arrays.toString(data));
		// toString 하면 arry를 string 취급해서 [] 안에 하나씩 넣어줌 
		
		
		
		
		for (int point=0; point<data.length; point++) {
			// 현재는 0이다.
			int maxIndex=point; //제일 큰 값이 있는 인덱스를 저장할 변수
			
			// 포인트에 있는 데이터와 포인트 다음에 있는 데이터들 중 제일 큰 값을 가진 인덱스를 구해서
			//이걸 maxIndex에 넣어라
			for ( int j=point+1; j<data.length; j++) {
				if (data[maxIndex] <data[j]) {
					maxIndex=j; //최대의 인덱스를 변경해주자
				}

			}
			int temp=data[point];
			data[point]=data[maxIndex];
			data[maxIndex]=temp;
		
			
		}
	System.out.println("정렬 후="+Arrays.toString(data));	
	}

}
