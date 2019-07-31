import java.io.InputStream;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = Scanner(System.in);
		
	
		
		System.out.println("############# BANCO DE BELO HORIZONTE ###############");
		System.out.println("#####################################################");
		System.out.println("Digite o seu nome de usuário");
	
	
			
	
		
		System.out.println("Seja bem vindo "  + " o que deseja fazer?");
		System.out.println("1 - Cadastrar nova conta");
		System.out.println("2 - Apurar saldo de conta corrente");
		System.out.println("3 - Fechar sistema");
		System.out.print("Digite a opção desejada:");
		
	
		/*
		
		if(opcao == 1) {
			
		}
		else if(opcao == 2) {
			
		}
		else {
			System.out.println("Sistema finalizado. Tenha um bom dia");
		}
		

*/

	
		sc.close();
		
	}

	private static Scanner Scanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
		
	
	}
}

