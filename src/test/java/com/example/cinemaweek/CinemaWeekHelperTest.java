package com.example.cinemaweek;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class CinemaWeekHelperTest {
	
	private CinemaWeekHelper tested = new CinemaWeekHelper();
	
	@Test
	public void whenYear2018Week0ThenException() {
		Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
				() -> tested.getStartingWednesday(2018, 0));
	}

	@Test
	public void whenYear2018Week1ThenStartingWednesdayIsJanuary3() {
		LocalDate locResult = tested.getStartingWednesday(2018, 1);
		Assertions.assertThat(locResult).isEqualTo(LocalDate.of(2018, Month.JANUARY, 3));
	}

	@Test
	public void whenYear2018Week52ThenStartingWednesdayIsDecember26() {
		LocalDate locResult = tested.getStartingWednesday(2018, 52);
		Assertions.assertThat(locResult).isEqualTo(LocalDate.of(2018, Month.DECEMBER, 26));
	}

	@Test
	public void whenYear2018Week53ThenException() {
		Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
				() -> tested.getStartingWednesday(2018, 53));
	}

	@Test
	public void whenYear2019Week1ThenStartingWednesdayIsJanuary2() {
		LocalDate locResult = tested.getStartingWednesday(2019, 1);
		Assertions.assertThat(locResult).isEqualTo(LocalDate.of(2019, Month.JANUARY, 2));
	}

	@Test
	public void whenYear2019Week37ThenStartingWednesdayIsSeptember11() {
		LocalDate locResult = tested.getStartingWednesday(2019, 37);
		Assertions.assertThat(locResult).isEqualTo(LocalDate.of(2019, Month.SEPTEMBER, 11));
	}

	@Test
	public void whenYear2019Week52ThenStartingWednesdayIsDecember25() {
		LocalDate locResult = tested.getStartingWednesday(2019, 52);
		Assertions.assertThat(locResult).isEqualTo(LocalDate.of(2019, Month.DECEMBER, 25));
	}

	@Test
	public void whenYear2019Week53ThenException() {
		Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
				() -> tested.getStartingWednesday(2019, 53));
	}

	@Test
	public void whenYear2020Week1ThenStartingWednesdayIsJanuary1() {
		LocalDate locResult = tested.getStartingWednesday(2020, 1);
		Assertions.assertThat(locResult).isEqualTo(LocalDate.of(2020, Month.JANUARY, 1));
	}

	@Test
	public void whenYear2020Week52ThenStartingWednesdayIsDecember23() {
		LocalDate locResult = tested.getStartingWednesday(2020, 52);
		Assertions.assertThat(locResult).isEqualTo(LocalDate.of(2020, Month.DECEMBER, 23));
	}

	@Test
	public void whenYear2020Week53ThenException() {
		Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
				() -> tested.getStartingWednesday(2020, 53));
	}

	@Test
	public void whenYear2021Week1ThenStartingWednesdayIsDecember30() {
		LocalDate locResult = tested.getStartingWednesday(2021, 1);
		Assertions.assertThat(locResult).isEqualTo(LocalDate.of(2020, Month.DECEMBER, 30));
	}

	@Test
	public void whenYear2021Week52ThenStartingWednesdayIsDecember22() {
		LocalDate locResult = tested.getStartingWednesday(2021, 52);
		Assertions.assertThat(locResult).isEqualTo(LocalDate.of(2021, Month.DECEMBER, 22));
	}

	@Test
	public void whenYear2021Week53ThenException() {
		Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
				() -> tested.getStartingWednesday(2021, 53));
	}

	@Test
	public void whenYear2022Week1ThenStartingWednesdayIsDecember29() {
		LocalDate locResult = tested.getStartingWednesday(2022, 1);
		Assertions.assertThat(locResult).isEqualTo(LocalDate.of(2021, Month.DECEMBER, 29));
	}

	@Test
	public void whenYear2022Week53ThenStartingWednesdayIsDecember28() {
		LocalDate locResult = tested.getStartingWednesday(2022, 53);
		Assertions.assertThat(locResult).isEqualTo(LocalDate.of(2022, Month.DECEMBER, 28));
	}

	@Test
	public void whenYear2022Week54ThenException() {
		Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
				() -> tested.getStartingWednesday(2022, 54));
	}

	@Test
	public void whenYear2023Week1ThenStartingWednesdayIsJanuary4() {
		LocalDate locResult = tested.getStartingWednesday(2023, 1);
		Assertions.assertThat(locResult).isEqualTo(LocalDate.of(2023, Month.JANUARY, 4));
	}

}
