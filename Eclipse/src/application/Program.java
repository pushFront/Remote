package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Aluguel;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter with the number of people: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		List<Aluguel> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			System.out.print("\nEnter with a ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter with your name: ");
			String name = sc.nextLine();
			System.out.print("Enter with yout email: ");
			String email = sc.nextLine();
			list.add(new Aluguel(id, name, email));
		}
		
		System.out.println();
		
		for(Aluguel i : list) {
			System.out.println(i);
		}
		
		sc.close();

	}

}