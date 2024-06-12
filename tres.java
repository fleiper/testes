package forcagril;
import java.util.Scanner;
public class tres {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		String usuario;

		System.out.println("===============BEM-VINDO============");
		System.out.println("OLÁ USER, PARA MELHOR CONFORTO EM NOSSO SISTEMA DIGITE SEU NOME: ");
		usuario = ler.next();

		for (int rep=0; rep<10; rep++) {
			System.out.println(usuario);
		}
	}
}
