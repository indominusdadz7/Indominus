import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal2 {
	
	public static void main(String[] args) {		
		Scanner leia = new Scanner(System.in);
		int n1, n2;
		double media;
		try {
		
		System.out.println("Digite o primeiro valor");
		n1 = leia.nextInt();
		System.out.println("digite o segundo valor");
		n2 = leia.nextInt();
		media = n1/n2;
		System.out.println("A media foi: " +media);
		}catch (InputMismatchException e) {
		System.out.println("Voce1 colocou um valor errado. Por exemplo,no lugar do numero colocou caractere");
		
		}catch(ArithmeticException e) {
			System.out.println("Voce tentou fazer uma divisa impossivel+");
		}
	}

}
