package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.User;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<User> user = new ArrayList<>();

		char resp;
		do {
			System.out.print("Digite o nome: ");
			String name1 = sc.nextLine();

			System.out.print("Numero de telefone: ");
			int number1 = sc.nextInt();

			User user1 = new User(name1, number1);
			user.add(user1);

			System.out.print("Outra Pessoa (s/n)? ");
			resp = sc.next().charAt(0);
			sc.nextLine();

		} while (resp != 'n');
		
		System.out.println(user);

		sc.close();
	}
}
