import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Exemplu4 {
	public static void main(String[] args) {
		BufferedReader in = null;
		PrintStream out = null;

		try {
			in = new BufferedReader(new InputStreamReader(
					new FileInputStream("C:\\git\\JavaCursTelecad\\Java1Curs6\\src\\test32.txt")));
			out = new PrintStream("C:\\git\\JavaCursTelecad\\Java1Curs6\\src\\test3tt.txt");

			String line = "";
			while ((line = in.readLine()) != null) {
				if (line.contains("3")) {
					out.print("hue");
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
}