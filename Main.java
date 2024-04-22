import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		double nota1, nota2, notaFinal;

		System.out.print("Digite a primeira nota: ");
		nota1 = scanner.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = scanner.nextDouble();

		notaFinal = (nota1 + nota2);

		if (notaFinal >= 60.00) {
			System.out.printf("Sua nota final foi de %.2f, parabéns!", notaFinal);
		} 
		else {
			System.out.printf("Sua nota final foi de %.2f, infelizmente você reprovou.", notaFinal);
		}

		scanner.close();

	}

}
