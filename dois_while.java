package forcagril;
import java.util.Scanner;
public class dois_while {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int num=0, soma=0;
		while (num<15) {
			num++;
			soma = soma+num;
			System.out.println("O RESULTADO É: "+soma);
			System.out.println("------------------");

		}

	}
}
