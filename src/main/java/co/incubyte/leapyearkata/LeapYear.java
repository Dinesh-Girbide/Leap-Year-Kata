package co.incubyte.leapyearkata;

public class LeapYear {

  public static boolean checkLeapYear(int year) {
    if (year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0)) {
      return true;
    }
    return false;
  }
}
