package forcagril;
import java.util.Scanner;
public class um {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		String jedi,usuario;
		System.out.println("Quem é você?");
		usuario = ler.next();
		
		for (int i=0; i<20; i++) {
			System.out.println("Eu sou um JEDI no Java -assinado: "+usuario);
		}
	}
}