package forcagril;
import java.util.Scanner;
public class cinco {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int idade,soma = 0;
		for (int pessoa=1; pessoa<=20; pessoa++) {//se começar em 1, teremos uma facilidade na media pois sera de 1 a 20
			System.out.println("me diga idade: ");
			idade = ler.nextInt();
			soma = idade+ soma;
			System.out.println("==============");
			System.out.println("soma: "+soma);	
		}
	}
}
