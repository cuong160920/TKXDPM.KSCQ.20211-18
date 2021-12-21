package utils;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import utils.Utils;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class test calculate minutes in a session
 *
 * @author Nguyen Manh Cuong
 * Create at: 22/12/2021
 * Project name: EBR
 * Teacher's name: Dr. Nguyen Thi Thu Trang
 * Class name: CNTT-03-K63 
 * Helpers: Teaching assistants
 */

public class UtilsTest {
	@ParameterizedTest
	@CsvSource({ "2021-11-12 20:00:00, 2020-12-12 22:10:30, -482269",
			"2018-05-19 21:11:59, 2021-10-11 12:10:30, 1786498", })	
	public void minusLocalDateTimeTest(String start, String end, long expected) {
		LocalDateTime startTime = LocalDateTime.parse(start, Utils.DATE_FORMATER);
		LocalDateTime endTime = LocalDateTime.parse(end, Utils.DATE_FORMATER);

		assertEquals(expected, Utils.minusLocalDateTime(startTime, endTime));
	}
}
