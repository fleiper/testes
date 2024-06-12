package forcagril;
import java.util.Scanner;
public class um_while {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int i = 0;
		while (i<20) {
			i++;
			System.out.println("Eu sou um jedi no java");
		}
		ler.close();
	}
}