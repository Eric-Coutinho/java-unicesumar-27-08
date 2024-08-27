package exercicio;

public class desafio4 {

	public static void main(String[] args) {
		int n = 0;
		for (int i = 0; i <= 10; i++) {
			System.out.println("número em for: " + i);
		}
		
		while (n <= 10) {
			System.out.println("número em while: " + n);
			n++;
		}
		
		n = 0;
		
		while (n <= 10) {
			if (n % 2 == 0) {
				System.out.println("número par em while: " + n);
			}

			n++;
		}
		
		System.out.println("acabo");
	}
}
