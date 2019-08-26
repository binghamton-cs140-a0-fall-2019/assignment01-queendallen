package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
		try(var output =new PrintWriter(new FileOutputStream(
		    new File("output.txt"), true /* true means append to file */))) {
					output.println("\nTESTS FOR Computer.java:");
					Computer comp1 = new Computer("Apple","1.6GHz dual-core Intel Core i5", 8, 128, true, 1099);
					Computer comp2 = new Computer("Apple", "1.6GHz dual-core Intel Core i5", 8, 256, false, 1099);
					Computer comp3 = new Computer("Apple", "1.6GHz dual-core Intel Core i5", 8, 1001, true, 1299);
					Computer comp4 = new Computer("Apple", "1.6GHz dual-core Intel Core i5", 8, 1128, false, 1299);
					System.out.println(comp1);
					System.out.println(comp2);
					System.out.println(comp3);
					System.out.println(comp4);

					Computer comp12 = new Computer("Apple","1.6GHz dual-core Intel Core i5", 8, 128, true, 1099);
					Computer comp22 = new Computer("Apple", "1.6GHz dual-core Intel Core i5", 8, 256, false, 1099);
					Computer comp32 = new Computer("Apple", "1.6GHz dual-core Intel Core i5", 8, 1001, true, 1299);
					Computer comp42 = new Computer("Apple", "1.6GHz dual-core Intel Core i5", 8, 1128, false, 1299);
					output.print(comp12);
					output.print(comp22);
					output.print(comp32);
					output.print(comp42);
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
