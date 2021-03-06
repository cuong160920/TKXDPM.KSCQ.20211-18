package model.bike;

/**
 * Model for standard bike
 *
 * @author Nguyen Van Chien
 *         <p>
 *         created_at: 22/12/2021
 *         <p>
 *         project name: EBR
 *         <p>
 *         teacher's name: Dr. Nguyen Thi Thu Trang
 *         <p>
 *         class name: KSCQ.CNTT 01 K63
 *         <p>
 *         helpers: teacher's teaching assistants
 */
public class StandardBike extends Bike {
	public StandardBike(int barcode) {
		this.barcode = barcode;
		this.saddle = 1;
		this.rearSeat = 1;
		this.pairOfPedals = 1;
		this.deposit = 1000000;
	}

	/**
	 * Constructor
	 * 
	 * @param barcode Standard bike's barcode
	 * @param value   Standard bike's value
	 * @param charge  Standard bike's renting fee
	 */
	public StandardBike(int barcode, int value, int charge) {
		this.barcode = barcode;
		this.saddle = 1;
		this.rearSeat = 1;
		this.pairOfPedals = 1;
		this.value = value;
		this.deposit = value / 10;
	}

	/**
	 * Most use constructor
	 * 
	 * @param id      Standard bike's uuid
	 * @param barcode Standard bike's barcode
	 * @param value   Standard bike's value
	 * @param charge  Standard bike's renting fee
	 */
	public StandardBike(String id, int barcode, int value, int charge) {
		this.id = id;
		this.barcode = barcode;
		this.saddle = 1;
		this.rearSeat = 1;
		this.pairOfPedals = 1;
		this.value = value;
		this.deposit = value / 10;
	}

	@Override
	public String getBikeType() {
		return "Standard Bike";
	}
}
