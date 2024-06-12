package forcagril;
import java.util.Scanner;
public class seis {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int idade,soma = 0,media;
		for (int pessoa=1; pessoa<=20; pessoa++) {
			System.out.println("me diga idade: ");
			idade = ler.nextInt();
			soma = idade+ soma;

		}
		media = soma/20; //a variavel "pessoa" só "existe" no for, então não consegui dividir pelo variavel, e fazer não aparecer na conta
		System.out.println("a media da idade das 20 pessoas é de "+media);
	}
}