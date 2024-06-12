package forcagril;
import java.util.Scanner;
public class cinco_while {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int pessoa=0,idade,media=0;
		
		while (pessoa<20) {
			System.out.println("Qual sua idade? ");
			idade = ler.nextInt();
			media = idade+media;
			System.out.println("----------------------");
			System.out.println("A soma das idades é de: ");
			
		}
	}

}
