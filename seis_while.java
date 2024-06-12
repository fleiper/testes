package forcagril;
import java.util.Scanner;
public class seis_while {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int pessoa =0, media =0, idade, soma=0;
		while (pessoa<20) {
			pessoa++;
			System.out.println("qual sua idade: ");
			idade = ler.nextInt();
			soma = soma+ idade;
		}
		media = soma/20;
		System.out.println("A media de idade dessas 20 pessoa é de: "+media);
	}

}
