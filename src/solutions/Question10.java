package solutions;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(2,2);
	}
	
	public static void solution(int ll, int lr) {
		int i = 0;
		int j = 0;
		
		
		for (;i  < ll+2; i++ ) {
			
			for (j = 0;j <= lr; j++) {
				System.out.print(i + " - "+ j + "\n");				
			}
		}
	}

}
