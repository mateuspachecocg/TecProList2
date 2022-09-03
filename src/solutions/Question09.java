package solutions;

public class Question09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(26, 33);
	}
	
	public static void solution(int n, int m) {
		int i = 0;
		int j = 0;
		
		for (j = m;i < n+1; i+=2,j+=3) {
			System.out.print(i + " - "+ j + "\n");
		}
	}

}
