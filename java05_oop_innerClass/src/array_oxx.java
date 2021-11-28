
public class array_oxx {

	public static void main(String[] args) {
		String arr[][]=new String [5][5];
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				if (i>j) {
					arr[i][j]="o";
				}
				else {
					arr[i][j]="x";
				}
			}
		}
		
		// 2차원 배열은 출력도 이중 포문으로 해야함. : 그냥 array를 하면 arr 전체를 의미하는 거라
		// length 를 이용하여 해주어야 함.
		// 근데 2차원 배열이면 확장된 for 문도 이용할 수는 있지만 잘 안함 (왜냐면 라인 나눠서 해야 하니까)
		for (int j=0; j<arr.length; j++) { //0,1,2,3,4
			for ( int k=0; k<arr.length; k++) {
				System.out.print(arr[j][k] + "\t");
			}
			System.out.println();
		}
	}

}
