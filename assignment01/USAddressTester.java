package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester {
  public static void main(String[] args) {
    try(var output =new PrintWriter(new FileOutputStream(
  			    new File("output.txt"), true /* true means append to file */))) {
  			output.println("\nTESTS FOR StreetUSAddress.java:");
            StreetUSAddress place1 = new StreetUSAddress("street 1", "street 2", "Binghamton", "NY", "13901");
            StreetUSAddress place2 = new StreetUSAddress("street 1", "", "Binghamton", "NY", "13901");
            System.out.println(place1);
            System.out.println(place2);

            StreetUSAddress place12 = new StreetUSAddress("street 1", "street 2", "Binghamton", "NY", "13901");
            StreetUSAddress place22 = new StreetUSAddress("street 1", "", "Binghamton", "NY", "13901");
            output.println(place12);
            output.println(place22);
  		//Copy all your lines above, add an extra "2" to every variable name
  		// and replace every System.out.print or System.out.println
  		// by output.print or output.println
  		} catch (FileNotFoundException e) {
  			e.printStackTrace();
  		}
  }
}
