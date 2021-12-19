package views.screen;

import javafx.stage.Stage;
import model.payment.transaction.PaymentTransaction;

import java.io.IOException;
/**
 * base screen handler for transaction result popup
 *
 * @author duykien
 * <p>
 * creted at: 15/12/2021
 * <p>
 * project name: EBR
 * <p>
 * teacher's name: Dr. Nguyen Thi Thu Trang
 * <p>
 * class name: CNTT02-K63
 */
public class BaseScreenHandlerWithTransactionPopup extends BaseScreenHandler {

    /**
     * contructor
     * @param stage {@link Stage stage}
     * @param screenPath URI to fxml
     * @throws IOException IO error
     */
    public BaseScreenHandlerWithTransactionPopup(Stage stage, String screenPath) throws IOException {
        super(stage, screenPath);
    }

    /**
     * Show transaction popup then auto-close
     * @param paymentTransaction transaction to be shown
     * @throws IOException IO error
     */
    public void continueAfterPopupClosed(PaymentTransaction paymentTransaction) throws IOException {

    }
}
