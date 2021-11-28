
public class Forox {

	public static void main(String[] args) {
		String arr[][]=new String [5][5];
		
		for (int i=5; i>=1; i--) {
			for (int s=1; s<=5-i; s++) {
				System.out.print("o");
			}
				for (int j=1; j<=i; j++) {
					System.out.print("X");                                                  
					
				}
				System.out.println();
			}
		

	}

}
