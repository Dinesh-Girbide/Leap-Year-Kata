package co.incubyte.leapyearkata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeapYearTest {

  @Test
  void year_divisible_by_4() {
    Assertions.assertTrue(LeapYear.checkLeapYear(8));
  }
}
