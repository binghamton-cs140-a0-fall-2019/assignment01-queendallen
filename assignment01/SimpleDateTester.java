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

				SimpleDate date = SimpleDate.of(2000,11,23);
				SimpleDate date2 = SimpleDate.of(2001, 12, 24);
				SimpleDate date3 = SimpleDate.of(2000, 11, 21);
				SimpleDate date4 = SimpleDate.of(2000, 12, 23);
				SimpleDate date5 = SimpleDate.of(1999, 11, 23);
				SimpleDate date6 = SimpleDate.of(2000, 11, 23);

               System.out.println(date.before(date2)); //true
               System.out.println(date.before(date3)); //false
               System.out.println(date.before(date4)); //true
               System.out.println(date.before(date5)); //false
               System.out.println(date.before(date6)); //false

               output.println(date.before(date2));
               output.println(date.before(date3));
               output.println(date.before(date4));
               output.println(date.before(date5));
               output.println(date.before(date6)); 

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
  }
}
