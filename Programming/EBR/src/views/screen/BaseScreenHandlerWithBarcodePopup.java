package views.screen;

import controller.SessionScreenController;
import javafx.stage.Stage;
import model.bike.Bike;
import model.session.Session;
import utils.Path;
import views.screen.bike.BikeScreenHandler;
import views.screen.session.SessionScreenHandler;

import java.io.IOException;

/**
 * base class for screen has barcode popup
 *
 * @author duykien
 *         <p>
 *         creted at: 15/12/2021
 *         <p>
 *         project name: EBR
 *         <p>
 *         teacher's name: Dr. Nguyen Thi Thu Trang
 *         <p>
 *         class name: CNTT02-K63
 *         <p>
 *         helpers: teacher's teaching assistants
 */
public class BaseScreenHandlerWithBarcodePopup extends BaseScreenHandler {
	public BaseScreenHandlerWithBarcodePopup(Stage stage, String screenPath) throws IOException {
		super(stage, screenPath);
	}

	public void moveToSessionScreen(Session session) {
		SessionScreenController sessionScreenController = new SessionScreenController();
		try {
			SessionScreenHandler sessionScreenHandler = new SessionScreenHandler(this.stage, Path.SESSION_SCREEN_PATH,
					session, sessionScreenController);
			sessionScreenHandler.setHomeScreenHandler(this.homeScreenHandler);
			sessionScreenHandler.setPreviousScreen(this);
			sessionScreenHandler.setScreenTitle(sessionScreenHandler.getScreenTitle());
			sessionScreenHandler.show();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}

	public void moveToBikeViewScreen(Bike bike) {
		try {
			BikeScreenHandler bikeScreenHandler = new BikeScreenHandler(this.stage, Path.BIKE_VIEW_SCREEN_PATH, bike);
			bikeScreenHandler.setHomeScreenHandler(this.homeScreenHandler);
			bikeScreenHandler.setPreviousScreen(this);
			bikeScreenHandler.setScreenTitle(bikeScreenHandler.getScreenTitle());
			bikeScreenHandler.toggleRentNowButton(true);
			bikeScreenHandler.show();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}
}
