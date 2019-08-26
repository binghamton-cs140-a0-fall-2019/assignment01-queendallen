package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester {
  public static void main(String[] args) {
    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");
          DateAndPlaceOfBirth dateAndBirth = new DateAndPlaceOfBirth(2000, 11, 23, "NYC", "NY", "USA");
          StreetUSAddress place = new StreetUSAddress("street 1", "street 2", "Binghamton", "NY", "13901");
          Person human = new Person("Dyandra", "Allen", "012-34-5678", dateAndBirth, place);
          System.out.println(human);
          Person human2 = new Person("Dyandra", "Allen", "023-45-6789", dateAndBirth, place);
          output.println(human2); //Won't print

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
  }
}
