package forcagril;
import java.util.Scanner;
public class quatro {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int dados,soma = 0;
		for (int user=0; user<10; user++) {
			System.out.println("me diga numeros: ");
			dados = ler.nextInt();
			soma = dados + soma;
			System.out.println("==============");
			System.out.println("soma: "+soma);
		}
	
	}
}