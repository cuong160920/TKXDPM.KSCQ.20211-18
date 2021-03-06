package model.bike;

/**
 * Model for twin electrical bike
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
public class TwinElectricalBike extends StandardElectricalBike {

	/**
	 * Constructor
	 * 
	 * @param barcode Twin electrical bike's barcode
	 * @param value   Twin electrical bike's value
	 * @param charge  Twin electrical bike's renting fee
	 */
	public TwinElectricalBike(int barcode, int value, int charge) {
		super(barcode, value, charge);
		this.saddle = 1;
		this.rearSeat = 1;
		this.pairOfPedals = 1;
		this.deposit = value / 10;
		this.battery = 100;
		this.timeLeft = 360;
	}

	/**
	 * Most use constructor
	 * 
	 * @param id      Twin electrical bike's uuid
	 * @param barcode Twin electrical bike's barcode
	 * @param value   Twin electrical bike's value
	 * @param charge  Twin electrical bike's renting fee
	 */
	public TwinElectricalBike(String id, int barcode, int value, int charge) {
		super(id, barcode, value, charge);
		this.saddle = 1;
		this.rearSeat = 1;
		this.pairOfPedals = 1;
		this.deposit = value / 10;
		this.battery = 100;
		this.timeLeft = 360;
	}

	@Override
	public String getBikeType() {
		return "Twin E-Bike";
	}
}
