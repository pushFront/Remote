/**
 * @author Rian Lima
 * @date   7.13.22
 */

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
			
			while(hasId(list, id) != false) {
				System.out.print("This id already exist, try another one: ");
				id = sc.nextInt();
				sc.nextLine();
			}
			
			System.out.print("Enter with your name: ");
			String name = sc.nextLine();
			System.out.print("Enter with your email: ");
			String email = sc.nextLine();
			System.out.print("Do you want to register your phone number? (y/n) ");
			char aux = sc.next().charAt(0);
			
			while(aux != 'y' && aux != 'n') {
				System.out.print("Please, just replay yes or no: (y/n) ");
				aux = sc.next().charAt(0);
			}
			
			if(aux == 'y') {
				System.out.print("Enter with your phone number: ");
				int phone = sc.nextInt();
				list.add(new Aluguel(id, name, email, phone));
			}
			
			else if(aux == 'n'){
				list.add(new Aluguel(id, name, email));
			}
		}
		
		System.out.println();
		
		for(Aluguel i : list) {
			System.out.println(i);
		}
		
		sc.close();

	}
	
	public static boolean hasId(List<Aluguel> list, int id) {
		Aluguel aux = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return aux != null ? true : false;
	}

}