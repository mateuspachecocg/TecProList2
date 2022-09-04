package solutions;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test for each item
		// itemA(6, 6);
		// itemB(6,6);
		// itemC(6,6);
		// itemD(6,6); 
		itemE(6,6);
		
	}
	
	public static void itemA (int row, int column) {
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
	
	public static void itemB (int row, int column) {
		int i = 1;
		int j = 1;
		
		for (;i <= row; i++) {
			
			for ( ;j  <= column; j++) {
				if ((i == j) || (i + j == (column+row)/2 + 1)) {
					System.out.print(" # ");
				} else {
					System.out.print(" * ");
				}
			}
			
			System.out.println();
			j = 1;
		}
	}
	
	public static void itemC (int row, int column) {
		int i = 1;
		int j = 1;
		
		for (;i <= row; i++) {
			
			for ( ;j  <= column; j++) {
				if (i%2 != 0) {
					System.out.print(" # ");
				} else {
					System.out.print(" * ");
				}
			}
			
			System.out.println();
			j = 1;
		}
	}
	
	public static void itemD (int row, int column) {
		int i = 1;
		int j = 1;
		
		for (;i <= row; i++) {
			
			for ( ;j  <= column; j++) {
				if (i == 1 || j == 1 || i == row || j == column ) {
					System.out.print(" # ");
				} else {
					System.out.print(" * ");
				}
			}
			
			System.out.println();
			j = 1;
		}
	}
	
	public static void itemE (int row, int column) {
		int i = 1;
		int j = 1;
		
		for (;i <= row; i++) {
			
			for ( ;j  <= column; j++) {
				if (i <= row/2) {
					System.out.print(" * ");
				} else if (j%2 != 0) {
					System.out.print(" # ");
				} else {
					System.out.print(" $ ");
				}
			}
			
			System.out.println();
			j = 1;
		}
	}
}
