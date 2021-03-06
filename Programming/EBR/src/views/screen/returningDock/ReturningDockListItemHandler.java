package views.screen.returningDock;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import model.dock.Dock;
import views.screen.FXMLScreenHandler;

import java.io.IOException;

/**
 * Handler for dock displaying of Returning Dock Screen
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
public class ReturningDockListItemHandler extends FXMLScreenHandler {
	@FXML
	private Text dockName;

	@FXML
	private Text dockParkingSlots;

	@FXML
	private ImageView dockImg;

	private ReturningDockSelectionHandler returningDockSelectionHandler;
	private Dock dock;

	/**
	 * constructor
	 * 
	 * @param screenPath                    path to .fxml file
	 * @param returningDockSelectionHandler parent screen
	 * @throws IOException IO error
	 */
	public ReturningDockListItemHandler(String screenPath, ReturningDockSelectionHandler returningDockSelectionHandler)
			throws IOException {
		super(screenPath);
		this.returningDockSelectionHandler = returningDockSelectionHandler;
		dockImg.setOnMouseClicked(e -> {
			returningDockSelectionHandler.onDockListItemClicked(dock);
		});
	}

	/**
	 * set the dock for handler and its info
	 *
	 * @param dock dock's instance
	 */
	public void setDock(Dock dock) {
		this.dock = dock;
		this.setDockInfo();
	}

	/**
	 * set elements of the dock list item
	 *
	 */
	private void setDockInfo() {
		dockName.setText(dock.getName());
		dockParkingSlots.setText(
				Integer.toString(dock.getCapacity() - dock.getNumberOfAvailableBike()) + '/' + dock.getCapacity());
		setImage(dockImg, dock.getImageURL());
	}
}
