package solutions;

public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(100);
	}
	
	public static void solution (int n) {
		int i = 0;
		
		System.out.print("{");
		
		for (i = 1;i < n; i++) {
			System.out.printf("%d,", i);
		}
		
		System.out.printf("%d }", i);
	}

}
