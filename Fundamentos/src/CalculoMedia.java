import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * C�lculo da M�dia
 * @author Lucas Ramos
 **
 */
public class CalculoMedia {

	public static void main(String[] args) {
		double nota1, nota2, media;
		System.out.println("C�lculo da M�dia");
		
		
		//criando um objeto para entrada de dados
		Scanner leia = new Scanner(System.in);
		leia.useLocale(Locale.ENGLISH);
		
		//Criando um objeto para formatar o resultado
		DecimalFormat formatador = new DecimalFormat("#0.0");
				
		System.out.print("Digite a nota1: ");
		nota1 = leia.nextDouble();
		
	
		System.out.print("Digite a nota2: ");
		nota2 = leia.nextDouble();
		media = (nota1 + nota2) / 2;
		System.out.println("M�dia: " + formatador.format(media));
	
		if (media < 5) {
			System.out.print("Reprovado ");
			
			
		} else {
			System.out.print("Aprovado ");

		}
		
		leia.close();
		
			
		
		
		
	}

}
