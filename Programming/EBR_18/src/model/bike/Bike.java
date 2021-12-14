package model.bike;

import java.sql.Timestamp;

public class Bike {
	protected String id;
	protected String barcode;
	protected String dockId;
	protected String licensePlate;
	protected int charge;
	protected String type;
	protected Timestamp createdAt;
	protected String imageURL;
	protected int deposit;
	protected int seatNum;
	protected int pedalNum;
	protected int saddleNum;

	public Bike() {

	}

	public Bike(String licensePlate, int charge, String type, String imageURL, int deposit, int seatNum, int pedalNum,
			int saddleNum) {

		this.licensePlate = licensePlate;
		this.charge = charge;
		this.type = type;
		this.createdAt = new Timestamp(System.currentTimeMillis());
		this.imageURL = imageURL;
		this.deposit = deposit;
		this.seatNum = seatNum;
		this.pedalNum = pedalNum;
		this.saddleNum = saddleNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Bike) {
			Bike bike = (Bike) obj;
			return bike.getId().equals(this.id);
		}
		return false;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getDockId() {
		return dockId;
	}

	public void setDockId(String dockId) {
		this.dockId = dockId;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public int getCharge() {
		return charge;
	}

	public void setCharge(int charge) {
		this.charge = charge;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}

	public int getPedalNum() {
		return pedalNum;
	}

	public void setPedalNum(int pedalNum) {
		this.pedalNum = pedalNum;
	}

	public int getSaddleNum() {
		return saddleNum;
	}

	public void setSaddleNum(int saddleNum) {
		this.saddleNum = saddleNum;
	}

}
