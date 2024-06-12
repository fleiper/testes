package forcagril;
import java.util.Scanner;
public class seven {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int idade,soma = 0, maior=0;
		for (int pessoa=1; pessoa<=20; pessoa++) {
			System.out.println("me diga idade: ");
			idade = ler.nextInt();
			System.out.println("==============");
			if (idade >=18) {
				maior++;
			}
			System.out.println(maior);
		}
	}
}



