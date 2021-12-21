package controller.barcodePopupController;

import common.exception.InvalidBarcodeFormatException;
import controller.BarcodePopupController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * This class test barcode input
 *
 * @author Nguyen Manh Cuong
 * Create at: 22/12/2021
 * Project name: EBR
 * Teacher's name: Dr. Nguyen Thi Thu Trang
 * Class name: CNTT-03-K63
 * Helpers: Teaching assistants
 */
public class validateBarcodeInputTest {

	private BarcodePopupController barcodeController;

	@BeforeEach
	void setUp() throws Exception {
		barcodeController = new BarcodePopupController();
	}

	@ParameterizedTest
	@CsvSource({ "'12', 12", "'12345asdf', 0", "'',0" })

	void test(String barcode, int expected) {
		int isValid;

		try {
			isValid = barcodeController.validateBarcodeInput(barcode);
		} catch (InvalidBarcodeFormatException e) {
			isValid = 0;
		}

		assertEquals(expected, isValid);
	}
}
