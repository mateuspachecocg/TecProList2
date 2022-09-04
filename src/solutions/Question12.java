package solutions;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test for each item
		// itemA(6, 6);
	}
	
	public static void itemA(int row, int column) {
		int i = 1;
		int j = 1;
		
		for (;i <= row; i++) {
			for ( ;j  <= column; j++) {
				if (i >= j) {
					System.out.print(" * ");
				}
			}
			System.out.println();
			j = 1;
		}
	}

}
