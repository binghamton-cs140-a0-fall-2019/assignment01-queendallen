package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class SimpleDateTester {
  public static void main(String[] args){
    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			         output.println("\nTESTS FOR SimpleDate.java:");
               SimpleDate date = new SimpleDate();
               SimpleDate date2 = new SimpleDate();
               SimpleDate date3 = new SimpleDate();
               SimpleDate date4 = new SimpleDate();
               SimpleDate date5 = new SimpleDate();
               SimpleDate date6 = new SimpleDate();

               var testDate = date.of(2000, 11, 23);
               var testDate2 = date2.of(2001, 12, 24);
               var testDate3 = date3.of(2000, 11, 21);
               var testDate4 = date4.of(2000, 12, 23);
               var testDate5 = date5.of(1999, 11, 23);
               var testDate6 = date6.of(2000, 11, 23);

               System.out.println(testDate.before(testDate2)); //true
               System.out.println(testDate.before(testDate3)); //false
               System.out.println(testDate.before(testDate4)); //true
               System.out.println(testDate.before(testDate5)); //false
               System.out.println(testDate.before(testDate6)); //false

               output.println(testDate.before(testDate2));
               output.println(testDate.before(testDate3));
               output.println(testDate.before(testDate4));
               output.println(testDate.before(testDate5));
               output.println(testDate.before(testDate6)); 

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
  }
}
