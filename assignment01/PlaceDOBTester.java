package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
  public static void main(String[] args) {
    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
		          output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");
              DateAndPlaceOfBirth loc1 = new DateAndPlaceOfBirth(2000, 11, 23, "NYC", "NY", "USA");
              DateAndPlaceOfBirth loc2 = new DateAndPlaceOfBirth(2000, 11, 23, "LA", "CA", "USA");
              DateAndPlaceOfBirth loc3 = new DateAndPlaceOfBirth(2015, 11, 23, "Houston", "TX", "USA");
              DateAndPlaceOfBirth loc4 = new DateAndPlaceOfBirth(2005, 12, 10, "Copenhagen", "Denmark");
              DateAndPlaceOfBirth loc5 = new DateAndPlaceOfBirth(2007, 06, 28, "Amsterdam", "Netherlands");
              System.out.println(loc1);
    					System.out.println(loc2);
    					System.out.println(loc3);
    					System.out.println(loc4);
              System.out.println(loc1.hasSameBirthDateAs(loc2)); //true
    					System.out.println(loc1.hasSameBirthDayAs(loc3)); //true
    					System.out.println(loc1.hasSameBirthDateAs(loc3)); //false
    					System.out.println(loc1.hasSameBirthDayAs(loc4)); //false
              System.out.println(loc1.olderThan(loc2)); //false
    					System.out.println(loc1.olderThan(loc3)); //true
              System.out.println(loc1.olderThan(loc4)); //true
    					System.out.println(loc4.youngerThan(loc5)); //false
    					System.out.println(loc3.youngerThan(loc4)); //true
              System.out.println(loc1.youngerThan(loc2)); //false

              DateAndPlaceOfBirth loc12 = new DateAndPlaceOfBirth(2000, 11, 23, "NYC", "NY", "USA");
              DateAndPlaceOfBirth loc22 = new DateAndPlaceOfBirth(2000, 11, 23, "LA", "CA", "USA");
              DateAndPlaceOfBirth loc32 = new DateAndPlaceOfBirth(2015, 11, 23, "Houston", "TX", "USA");
              DateAndPlaceOfBirth loc42 = new DateAndPlaceOfBirth(2005, 12, 10, "Copenhagen", "Denmark");
              DateAndPlaceOfBirth loc52 = new DateAndPlaceOfBirth(2007, 06, 28, "Amsterdam", "Netherlands");
              output.print(loc12);
    					output.print(loc22);
    					output.print(loc32);
    					output.print(loc42);
              output.println(loc1.hasSameBirthDateAs(loc2)); //true
    					output.println(loc1.hasSameBirthDayAs(loc3)); //true
    					output.println(loc1.hasSameBirthDateAs(loc3)); //false
    					output.println(loc1.hasSameBirthDayAs(loc4)); //false
              output.println(loc1.olderThan(loc2)); //false
    					output.println(loc1.olderThan(loc3)); //true
              output.println(loc1.olderThan(loc4)); //true
    					output.println(loc4.youngerThan(loc5)); //false
    					output.println(loc3.youngerThan(loc4)); //true
              output.println(loc1.youngerThan(loc2)); //false
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
  }
}
