package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester {
	public static void main(String[] args) {
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");
					DateAndPlaceOfBirth dateAndBirth = new DateAndPlaceOfBirth(2000, 11, 23, "NYC", "NY", "USA");
					StreetUSAddress place = new StreetUSAddress("street 1", "street 2", "Binghamton", "NY", "13901");
					Person human = new Person("Dyandra", "Allen", "012-34-5678", dateAndBirth, place);

					ComputerOwner owner = new ComputerOwner(human);
					Computer comp1 = new Computer("Apple","1.6GHz dual-core Intel Core i5", 8, 128, true, 1099);
					Computer comp2 = new Computer("Apple", "1.6GHz dual-core Intel Core i5", 8, 256, false, 1099);
					Computer comp3 = new Computer("Apple", "1.6GHz dual-core Intel Core i5", 8, 1001, true, 1299);
					Computer comp4 = new Computer("Apple", "1.6GHz dual-core Intel Core i5", 8, 1128, false, 1299);
					owner.addComputer(comp1);
					owner.addComputer(comp2);
					owner.addComputer(comp3);
					owner.addComputer(comp4);

					System.out.println(owner);
					output.println(owner);

					owner.removeComputer(3);
					owner.removeComputer(2);

					System.out.println(owner);
					output.println(owner);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
