package co.incubyte.leapyearkata;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class LeapYearTest {

  @Test
  void year_divisible_by_four_should_return_true() {
    assertTrue(LeapYear.checkLeapYear(8));
  }

  @Test
  void year_divisible_by_four_and_onehundred_and_not_by_fourhundred_should_return_false() {
    assertFalse(LeapYear.checkLeapYear(1800));
  }
}
