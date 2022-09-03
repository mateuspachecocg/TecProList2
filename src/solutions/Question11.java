package solutions;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(2,3);
	}
	
	public static void solution(int ll, int lr) {
		int i = 0;
		int j = 0;
		
		
		for (;i  < ll+2; i++ ) {
			
			for (j = 1;j <= lr; j++) {
				int k = 0;
				for (;k <= j; k++) {
					System.out.print(i + " - "+ k + "\n");				
				}		
			}
		}
	}

}
