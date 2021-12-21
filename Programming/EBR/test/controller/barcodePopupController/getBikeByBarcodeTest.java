package controller.barcodePopupController;

import controller.BarcodePopupController;
import model.bike.Bike;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
/**
 * This class test get Bike by barcode
 *
 * @author Nguyen Manh Cuong
 * Create at: 22/12/2021
 * Project name: EBR
 * Teacher's name: Dr. Nguyen Thi Thu Trang
 * Class name: CNTT-03-K63
 * Helpers: Teaching assistants
 */
public class getBikeByBarcodeTest {
    private BarcodePopupController barcodePopupController;

    @BeforeEach
    void setUp() throws Exception {
        barcodePopupController = new BarcodePopupController();
    }

    @ParameterizedTest
    @CsvSource({
            "188831, 188831",
            "1234567, 0"
    })

    void getBikeTest(int barcode, int expected) {
        try {
            Bike bike = barcodePopupController.getBikeByBarcode(barcode);
            Assertions.assertEquals(expected, bike.getBarcode());
        } catch (Exception e){
            Assertions.assertEquals(expected, 0);
        }
    }
}
