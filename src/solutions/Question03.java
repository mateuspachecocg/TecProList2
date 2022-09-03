package solutions;

public class Question03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(100);
	}
	
	public static void solution (int n) {
		int i = 0;
		
		System.out.print("{");
		
		for (i = n;i > 1; i--) {
			System.out.printf("%d,", i);
		}
		
		System.out.printf("%d}", i);
	}
}
