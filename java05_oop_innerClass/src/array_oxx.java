
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
		
		// 2���� �迭�� ��µ� ���� �������� �ؾ���. : �׳� array�� �ϸ� arr ��ü�� �ǹ��ϴ� �Ŷ�
		// length �� �̿��Ͽ� ���־�� ��.
		// �ٵ� 2���� �迭�̸� Ȯ��� for ���� �̿��� ���� ������ �� ���� (�ֳĸ� ���� ������ �ؾ� �ϴϱ�)
		for (int j=0; j<arr.length; j++) { //0,1,2,3,4
			for ( int k=0; k<arr.length; k++) {
				System.out.print(arr[j][k] + "\t");
			}
			System.out.println();
		}
	}

}
