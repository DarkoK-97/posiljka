package application;

public class App {

	public static void main(String[] args) {

		String name1 = "Milan";
		String last1 = "Kljajic";
		String adress1 = "Bate Brkica";

		String name2 = "Darko";
		String last2 = "Kolobaric";
		String adress2 = "Dunavska";

		String send = name1 + " " + last1 + ", " + adress1 + ",";
		String receive = name2 + " " + last2 + ", " + adress2 + ",";

		System.out.println("Sender " + send + " sends a package to " + receive + ".");

		int weight = 10;
		System.out.println("The weight of the package is " + weight + "kg" + ".");

		String registeredmail = "yes";
		System.out.println("Is the mail registered: " + registeredmail);

	}

}
