package pacoteaula;

import java.util.Scanner;

public class seSen�o2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade<=10)
		{
			System.out.println("Voc� � crian�a");
		}
		else if(idade<=17)
		{
			System.out.println("Voc� � adolescente");
		}
		else
		{
			System.out.println("Voce � adulto ");
		}
		
	}

}
