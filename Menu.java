package lab6;

import java.io.*;
import java.util.*;

public class Menu implements MenuItem {

	List<MenuItem> items;

	public static void main(String[] args) throws NullPointerException {
		Scanner input = new Scanner(System.in);

//		System.out.println("Välkommen till  ett konsolbaserat menysystem!");
//		System.out.println("=============================================");

//		Menu testMenu = new Menu("Testmeny");
//		testMenu.add(new AbstractMenuItem("Tillbaka") {
//			public void execute() {
//			}
//		});
//		testMenu.add(new AbstractMenuItem("Skriv ut hej") {
//			public void execute() {
//				System.out.println("Hej!!");
//			}
//		});
//		testMenu.add(testMenu);

		Menu mainMenu = new Menu("Huvudmeny");
		Menu addItem = new Menu("Lägg till vara");
		Menu shoppingLista = new Menu("Shoppinglista");

		mainMenu.add(new AbstractMenuItem("Avsluta") {

			public void execute() {
				System.exit(0);

			}
		});

		mainMenu.add(new AbstractMenuItem("Inhandlingslista") {
			public void execute() {
				shoppingLista.execute();
			}
		});

		shoppingLista.add(new AbstractMenuItem("Tillbaka") {
			public void execute() {
				mainMenu.execute();
			}
		});

		shoppingLista.add(new AbstractMenuItem("Bok") { // Kopiera denna för alla items vi ska ha, vad för meny?
			public void execute() {
				mainMenu.execute();
			}
		});
		shoppingLista.add(new AbstractMenuItem("Film") { // Kopiera denna för alla items vi ska ha, vad för meny?
			public void execute() {
				mainMenu.execute();
			}
		});

		mainMenu.add(new AbstractMenuItem("Lägg till vara") {
			public void execute() {
				addItem.execute();
			}
		});
//		mainMenu.execute();
//		shoppingLista.execute();
//		addItem.execute();
	}

	
	
	/**
	 * Skapar en tom meny med den givna rubriken.
	 */

	private String title;

	public Menu(String title) {
		/**
		 * Lägger till ett menyval till menyn.
		 */
		items = new ArrayList<>();
		this.title = title;

	}

	public void add(MenuItem item) {
		items.add(item);
	}

	public String getTitle() {
		return title;

	}

	/**
	 * Exekverar menyn enligt loopen definierad i punkterna (1) till (4). (1)
	 * Skriver ut menyns rubrik med stora bokstäverunderstruket med =. Därefter
	 * följer en numrerad lista över alla menyelement i denna meny, numrerade från
	 * 0. (2) Användaren får sedan välja ett av alternativen genom att ange talet
	 * framför menyvalet. Vad händer om man inte anger ett giltigt tal? Användarens
	 * menyval exekveras. (3) Om menyval 0 valts så returnerar metoden. 0 motsvarar
	 * alltså alltid av avsluta/tillbaka/återgå. (4) gå till (1)
	 */
	public void execute() {
		Scanner input = new Scanner(System.in);
		int index = 0;
		MenuItem toRun = null;
		System.out.println(getTitle());
		System.out.println("=======");
		for (MenuItem item : items) {
//			if(item.getTitle().equals(this.getTitle()))

			System.out.println(index + "." + item.getTitle());
			index++;
			
		}
		System.out.println("Välj meny...");
		int selection = input.nextInt();
		toRun =items.get(selection);
		toRun.execute();
		

	}

//		items = (List<MenuItem>) items.get(selection);
//		((Menu) items).execute();

}