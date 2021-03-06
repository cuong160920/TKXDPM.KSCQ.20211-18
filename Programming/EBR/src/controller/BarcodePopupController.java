package controller;

import common.exception.BarcodeNotFoundException;
import common.exception.InvalidBarcodeFormatException;
import common.exception.NullBarcodeException;
import model.bike.Bike;
import model.bike.BikeManager;

/**
 * class for barcode popup screen
 *
 * @author HHDang
 *         <p>
 *         created_at: 15/12/2021
 *         <p>
 *         project name: EBR
 *         <p>
 *         teacher's name: Dr. Nguyen Thi Thu Trang
 *         <p>
 *         class name: KSCQ.CNTT 03 K63
 *         <p>
 *         helpers: teacher's teaching assistants
 */
public class BarcodePopupController extends BaseController {

	/**
	 * This method is used to validate barcode input
	 * 
	 * @param barcode barcode to be checked
	 * @return true if barcode is valid
	 * @throws InvalidBarcodeFormatException wrong barcode format
	 */

	public int validateBarcodeInput(String barcode) throws InvalidBarcodeFormatException, NullBarcodeException {
		try {
			if (barcode == null)
				throw new NullBarcodeException();
			return Integer.parseInt(barcode);
		} catch (NumberFormatException e) {
			throw new InvalidBarcodeFormatException();
		}
	}

	/**
	 * This method is used to get bike from barcode
	 * 
	 * @param barcode barcode
	 * @return bike corresponding to barcode
	 * @throws BarcodeNotFoundException barcode not found error
	 */

	public Bike getBikeByBarcode(int barcode) throws BarcodeNotFoundException {
		Bike bike = BikeManager.getInstance().getBikeByBarcode(barcode);
		if (bike == null) {
			throw new BarcodeNotFoundException();
		}
		return bike;
	}
}
