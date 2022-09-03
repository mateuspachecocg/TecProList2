package solutions;

public class Question07 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(100, 3);
	}
	
	public static void solution(int n, int m) {
		int i = 0;
		int j = 0;
		
		
		for (;i < n+1; i++,j=i*3) {
			System.out.print(i + " - "+ j + "\n");
		}
	}
}
