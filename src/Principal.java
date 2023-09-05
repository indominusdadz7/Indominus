
public class Principal {
	
	public static void main(String[] args) {
		
			int a=5,b=0;
			try {
			double resultado;
			resultado = a/b;
			System.out.println("0 Resultado da devisão é;"+resultado);
		}catch (ArithmeticException e) {
			System.out.println("Você não pode dividir por zero");
		}
		System.out.println("A ="+ a);
		System.out.println("B ="+b);
		System.out.println("Fim do Programa");
	
		
	}

}
