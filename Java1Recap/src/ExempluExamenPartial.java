import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExempluExamenPartial {
	public static void main(String[] args) {

		Magazin magazin = new Magazin();

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String line = "";
		try {
			while (true) {
				line = in.readLine();
				String[] array = line.split(" ");

				if (array[0].equals("adauga")) {
					String nume = array[1];
					double pret = Double.parseDouble(array[2]);

					Produs p = new Produs(nume, pret);
					magazin.adaugaProdus(p);
				}

				if (array[0].equals("afiseaza")) {
					magazin.afiseazaProdus();
				}

				if (array[0].equals("exit")) {
					System.exit(0);
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}