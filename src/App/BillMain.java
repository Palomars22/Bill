package App;


import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class BillMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char gender;
		int beer, barbecue, softDrink;


		System.out.println("Digite sexo da pessoa ");
		gender = sc.nextLine().charAt(0);
		while (gender != 'M' && gender != 'F') {
			System.out.println("Valor invalido- colocar F ou M");
			System.out.println("Digite novamente");
			gender = sc.next().charAt(0);
		}

		System.out.println("Quantidade de cervejas");
		beer = sc.nextInt();
		System.out.println("Quantidade de refri");
		softDrink = sc.nextInt();
		System.out.println("Quantidade de espetinhos");
		barbecue = sc.nextInt();
		Bill b = new Bill(gender, beer, softDrink, barbecue);		
		
			System.out.println("-----------------------------------------");
			System.out.println("Sexo : " + b.getGender());
			System.out.println("Quantidade de cervejas : " + b.getBeer());
			System.out.println("Quantidade de refri : " + b.getSoftdrink());
			System.out.println("Quantidade de espetinhos : " + b.getBarbecue());
			System.out.println("-----------------------------------------");
			System.out.println("Relatorio de Gastos  ");
			System.out.println("-----------------------------------------");
			System.out.println("Consumo = R$ : " + b.couver(beer, softDrink, barbecue));
			if (b.feeding(beer, softDrink, barbecue) == 0) {
				System.out.println("Isento de Courvet");
			} else {
				System.out.println("Couvert = R$ :" + b.feeding(beer, softDrink, barbecue));
			}
			System.out.println("Ingresso = R$ :" + b.ticket(gender));
			System.out.println();
			System.out.println("Total da conta R$ : " + b.total(beer, softDrink, barbecue, gender, softDrink));

		

		sc.close();
	}
}
