package controller.InvocieScreenController;

import controller.InvoiceScreenController;
import model.payment.paymentCard.creditCard.CreditCard;
import model.payment.transaction.PaymentTransaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class test refund 
 *
 * @author Nguyen Manh Cuong
 * Create at: 22/12/2021
 * Project name: EBR
 * Teacher's name: Dr. Nguyen Thi Thu Trang
 * Class name: CNTT-03-K63
 * Helpers: Teaching assistants
 */

public class ValidateReturnedTest {
    InvoiceScreenController invoiceScreenController;
    PaymentTransaction tmpTransaction;
    CreditCard card;

    @BeforeEach
    void Setup() {
        invoiceScreenController = new InvoiceScreenController();
    }
    @ParameterizedTest
    @CsvSource({
            "10, true",
            "-10, false",
            "100000, true"
    })
    public void validateReturnedTest(int returned, boolean expected) {
    	boolean isValid = invoiceScreenController.validateReturned(returned);
        assertEquals(expected, isValid);
    }



}
