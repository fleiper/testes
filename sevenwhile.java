package forcagril;
import java.util.Scanner;
public class sevenwhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int pessoa = 1,idade,soma = 0;
		while (pessoa<20){
			pessoa++;
			System.out.println("==============");
			System.out.println("me diga idade: ");
			idade = ler.nextInt();
			System.out.println("==============");
			String mensagem = idade >=18 ? "Maior de idade" : "Menor de Idade" ;
			System.out.println(mensagem);
			
			}	
		}
	}
