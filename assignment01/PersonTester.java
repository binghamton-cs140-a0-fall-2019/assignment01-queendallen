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
          output.print(human2); //Won't print
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
  }
}
