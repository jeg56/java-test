package com.example.cinemaweek;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.Month;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CinemaWeekCommandProcessorTest {
	
	private CinemaWeekHelper helper = Mockito.mock(CinemaWeekHelper.class);
	private CinemaWeekCommandProcessor tested = new CinemaWeekCommandProcessor(helper);
	
	private static ByteArrayOutputStream out = new ByteArrayOutputStream();
	private static ByteArrayOutputStream err = new ByteArrayOutputStream();
	
	@BeforeAll
	public static void beforeAll() {
		System.setOut(new PrintStream(out));
		System.setErr(new PrintStream(err));
	}
	
	@BeforeEach
	public void beforeEach() {
		Mockito.reset(helper);
		out.reset();
		err.reset();
	}
	
	@Test
	public void whenCalledWith_2019_37_ThenCallsHelperAndPrintsReturnedDate() {
		Mockito.when(helper.getStartingWednesday(2019, 37)).thenReturn(LocalDate.of(1789, Month.JULY, 14));
		tested.process(new String[] { "2019", "37" });
		Mockito.verify(helper).getStartingWednesday(2019, 37);
		Mockito.verifyNoMoreInteractions(helper);
		Assertions.assertThat(out.toString()).isEqualTo(String.format("1789-07-14%n"));
	}
	
	@Test
	public void whenCalledWith_2019_37_AndHelperThrowsExceptionThenPrintsERROR() {
		Mockito.when(helper.getStartingWednesday(2019, 37)).thenThrow(new IllegalArgumentException("Message"));
		tested.process(new String[] { "2019", "37" });
		Mockito.verify(helper).getStartingWednesday(2019, 37);
		Mockito.verifyNoMoreInteractions(helper);
		Assertions.assertThat(err.toString()).isEqualTo(String.format("ERROR%n"));
	}
	
	@Test
	public void whenCalledWith_2019_Foo_ThenPrintsERROR() {
		tested.process(new String[] { "2019", "Foo" });
		Mockito.verifyNoMoreInteractions(helper);
		Assertions.assertThat(err.toString()).isEqualTo(String.format("ERROR%n"));
	}
	
	@Test
	public void whenCalledWith_2019_ThenPrintsERROR() {
		tested.process(new String[] { "2019" });
		Mockito.verifyNoMoreInteractions(helper);
		Assertions.assertThat(err.toString()).isEqualTo(String.format("ERROR%n"));
	}
	
	@Test
	public void whenCalledWith_Empty_ThenPrintsERROR() {
		tested.process(new String[] { });
		Mockito.verifyNoMoreInteractions(helper);
		Assertions.assertThat(err.toString()).isEqualTo(String.format("ERROR%n"));
	}
	
	@Test
	public void whenCalledWith_2019_37_2_ThenPrintsERROR() {
		tested.process(new String[] { "2019", "37", "2"});
		Mockito.verifyNoMoreInteractions(helper);
		Assertions.assertThat(err.toString()).isEqualTo(String.format("ERROR%n"));
	}
	
	@Test
	public void whenCalledWith_null_ThenPrintsERROR() {
		tested.process(null);
		Mockito.verifyNoMoreInteractions(helper);
		Assertions.assertThat(err.toString()).isEqualTo(String.format("ERROR%n"));
	}
	
}
