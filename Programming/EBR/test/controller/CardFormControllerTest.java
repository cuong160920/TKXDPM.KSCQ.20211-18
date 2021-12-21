package controller;

import controller.CardFormController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * This class test card info
 *
 * @author Nguyen Manh Cuong
 * Create at: 22/12/2021
 * Project name: EBR
 * Teacher's name: Dr. Nguyen Thi Thu Trang
 * Class name: CNTT-03-K63
 * Helpers: Teaching assistants
 */
public class CardFormControllerTest {

	private CardFormController cardFormController;

//
	@BeforeEach
	void Setup() {
		cardFormController = new CardFormController();
	}

	@ParameterizedTest
	@CsvSource({ "kscq1_group18_2021,", "'', CARD NUMBER IS NOT FILLED!", "'123546 abcd', INVALID CARD NUMBER" })
	public void validateCardNumberTest(String cardNumber, String expected) {
		try {
			cardFormController.validateCardNumber(cardNumber);
		} catch (Exception e) {
			Assertions.assertEquals(expected, e.getMessage());
		}
	}

	@ParameterizedTest
	@CsvSource({ "Group 18,", ", CARD OWNER IS NOT FILLED", "Group-18, INVALID CARD OWNER" })
	public void validateCardOwnerTest(String cardOwner, String expected) {
		try {
			cardFormController.validateCardOwner(cardOwner);
		} catch (Exception e) {
			Assertions.assertEquals(expected, e.getMessage());
		}
	}

	@ParameterizedTest
	@CsvSource({ "112,", ", SECURITY CODE IS NOT FILLED", "ABC, INVALID SECURITY CODE", "1124, INVALID SECURITY CODE" })
	public void validateSecurityCodeTest(String securityCode, String expected) {
		try {
			cardFormController.validateSecurityCode(securityCode);
		} catch (Exception e) {
			Assertions.assertEquals(expected, e.getMessage());
		}
	}

	@ParameterizedTest
	@CsvSource({ "1125,", ", EXP DATE IS NOT FILLED", "1119, INVALID EXP DATE", "11/25, INVALID EXP DATE" })
	public void validateExpDateTest(String expDate, String expected) {
		try {
			cardFormController.validateExpDate(expDate);
		} catch (Exception e) {
			Assertions.assertEquals(expected, e.getMessage());
		}
	}

}
