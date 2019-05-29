
public class primitivos {

	public static void main(String[] args) {
		
		// Tipos primitivos (variáveis)
		
		//dando um tipo pra variável obrigatorio tipo boleando (verdadeiro ou falso)
		boolean completo = true;
		
		//Tipo char um caractere unicode ('aspas simples')
		char sexo = 'F';
		
		//Tipo byte (números inteiros)
		byte idade = 18;
		
		//Tipo hort (números inteiros) roda mias números do que o tipo byte
		short numero = 1;
		
		//Tipo int números inteiros Padrão para números inteiros
		int numero2 = 1968;
		
		//Tipo long números interos  (cabe muito mais número do que a int)
		//colocar um L no final indica que é um número muito grande colocar o L só quando der erro
		long numero3 = 214565565685L;
		
		//Tipo float números não inteiros
		//colocar o f quando tiver algum erro 
		float nota1 = 5.6f;
		
		//Tipo double números não inteiros
		//Não dá erro pq é o padrão do java para números não inteiros
		double nota2 = 8.6;
		
		//Cadeia de (caracteres usa aspas normal "") String
		String nome = "Sirlene";
		
		//(Aceita qualquer coisa números inteiros não inteiros) Object 
		Object teste1 = "5.5f";
		
		System.out.println(completo);
		System.out.println(sexo);
		System.out.println(idade);
		System.out.println(numero);
		System.out.println(numero2);
		System.out.println(numero3);
		System.out.println(nota1);
		System.out.println(nota2);
		System.out.println(nome);
		System.out.println(teste1);
	}

}
