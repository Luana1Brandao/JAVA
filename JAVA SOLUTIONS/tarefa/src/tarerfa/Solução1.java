package tarerfa;

import java.util.Scanner;

public class Solu��o1 {

	public static void main(String[] args) {
		//**Desenvolva um programa que leia tr�s vari�veis (a, b, c) e resolva a express�o: ( a + b ) / c //*
		
			Scanner imput = new Scanner(System.in);
			int A, B, C;
			
			System.out.print("insita aqui o valor de A:");
			A = imput.nextInt();
			
			System.out.print("insira aqui o valor de B:");
			B= imput.nextInt();
			
			System.out.print("insira aqui o valor de C:");
			C= imput.nextInt();
			
			
			
			//* sa�da//*
			
			System.out.print("O Resultado �:" + (( A + B ) / C ));
			
			
			

	}

}
