package pacoteaula;

import java.util.Scanner;

public class seSenao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3, res = 0;
		
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		num1 = leia.nextInt();
		System.out.println("Digite um numero: ");
		num2 = leia.nextInt();
		System.out.println("Digite um numero: ");
		num3 = leia.nextInt();
		
		if(num1>num2 && num1>3)
		{
			
			System.out.println(" O maior valor é: "+num1);
		}
		else if( num2>num1 && num2>num3)
		{
			
			System.out.println(" O maior valor é: "+num2);
		}
			else
			{
				System.out.println(" O maior valor é: "+num3);
			}
	}

}
