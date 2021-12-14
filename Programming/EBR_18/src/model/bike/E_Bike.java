package model.bike;

import java.sql.Time;

public class E_Bike extends Bike {
	protected int battery;
	protected Time timeRemainTime;

	public E_Bike() {

	}

	public E_Bike(String licensePlate, int charge, String type, String imageURL, int deposit, int seatNum, int pedalNum,
			int saddleNum, int battery) {
		super(licensePlate, charge, type, imageURL, deposit, seatNum, pedalNum, saddleNum);
		this.battery = battery;
	}
}
