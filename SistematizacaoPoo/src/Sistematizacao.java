import java.util.Scanner;

public class Sistematizacao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//nome, alergia, problemas medicos, telefone, email
		
		System.out.println("Digite o Nome: ");
		String nomeDigitado = leitor.nextLine();
		
		System.out.println("Digite a Alergia: ");
		String alergiaDigitada = leitor.nextLine();
		
		System.out.println("Digite o Proplema Medico: ");
		String problemaDigitado = leitor.nextLine();
		
		System.out.println("Digite o E-mail: ");
		String email = leitor.nextLine();
		
		System.out.println("Digite o Numero Telefone");
		Long numtelefone = leitor.nextLong();
		
		
		
		System.out.println("------------------");
		System.out.println("");
		System.out.println("O Nome ..........: " + nomeDigitado );
		System.out.println("Alergia..........: " + alergiaDigitada );
		System.out.println("Problemas Medicos: " + problemaDigitado );
		System.out.println("Telefone.........: " + numtelefone );
		System.out.println("E-mail...........: " + email );
		System.out.println("");
		System.out.println("------------------");
		
	}
	
	
}
