package solutions;

public class Question08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(49, 100);
	}
	
	public static void solution(int n, int m) {
		int i = 0;
		int j = 0;
		
		
		for (j = m;i < n+1; i++,j--) {
			System.out.print(i + " - "+ j + "\n");
		}
	}

}
