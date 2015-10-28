import java.io.IOException;

public class App {

	public static void main(String[] args) {
		Test test = new Test();

		/*
		 * try { test.run(); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } catch (ParseException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		/*
		 * try { test.run(); } catch (IOException | ParseException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		try {
			test.run();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			test.input();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
