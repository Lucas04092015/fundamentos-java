
public class primitivos {

	public static void main(String[] args) {
		
		// Tipos primitivos (vari�veis)
		
		//dando um tipo pra vari�vel obrigatorio tipo boleando (verdadeiro ou falso)
		boolean completo = true;
		
		//Tipo char um caractere unicode ('aspas simples')
		char sexo = 'F';
		
		//Tipo byte (n�meros inteiros)
		byte idade = 18;
		
		//Tipo hort (n�meros inteiros) roda mias n�meros do que o tipo byte
		short numero = 1;
		
		//Tipo int n�meros inteiros Padr�o para n�meros inteiros
		int numero2 = 1968;
		
		//Tipo long n�meros interos  (cabe muito mais n�mero do que a int)
		//colocar um L no final indica que � um n�mero muito grande colocar o L s� quando der erro
		long numero3 = 214565565685L;
		
		//Tipo float n�meros n�o inteiros
		//colocar o f quando tiver algum erro 
		float nota1 = 5.6f;
		
		//Tipo double n�meros n�o inteiros
		//N�o d� erro pq � o padr�o do java para n�meros n�o inteiros
		double nota2 = 8.6;
		
		//Cadeia de (caracteres usa aspas normal "") String
		String nome = "Sirlene";
		
		//(Aceita qualquer coisa n�meros inteiros n�o inteiros) Object 
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
