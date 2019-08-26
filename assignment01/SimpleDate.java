package assignment01;
/**
 * Class to store a data.
 * @author CS 140
 *
 */
public class SimpleDate {
  private int year;
  private int month;
  private int day;

  /**
   * Method used to set the values of all the fields.
   * @param yr the year of birth (use 4 digits)
   * @param m the month of birth (a value of 1 through 12)
   * @param d the day in the month of the birth
   */
  public static SimpleDate of(int yr, int m, int d) {
       var returnValue = new SimpleDate();
       returnValue.year = yr;
       returnValue.month = m;
       returnValue.day = d;
       return returnValue;
  }

  /**
	 * The method before returns true if the date of birth of
	 * this SimpleDate is before the date of other,
	 * otherwise false.
	 * @param other the SimpleDate for comparison
	 * @return true if this SimpleDate has a date that
	 * is older than the date of other and false otherwise
	 */
  public boolean before(SimpleDate other) {
    return (this.year < other.year || (this.month < other.month && this.year == other.year) ||
    (this.day < other.day && this.month == other.month && this.year == other.year));
  }
}
