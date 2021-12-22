package model.payment;

/**
 * class for accessing DB related functions and managing list of Credit Card
 *
 * @author Nguyen Van Chien
 * <p>
 * created_at: 22/12/2021
 * <p>
 * project name: EBR
 * <p>
 * teacher's name: Dr. Nguyen Thi Thu Trang
 * <p>
 * class name: KSCQ.CNTT 01 K63
 * <p>
 * helpers: teacher's teaching assistants
 */
public class CreditCard {
	private String cardNum;
	private String cardOwner;
	private int securityCode;
	private String expDate;

	public CreditCard(String cardNum, String cardOwner, int securityCode, String expDate) {
		super();
		this.cardNum = cardNum;
		this.cardOwner = cardOwner;
		this.securityCode = securityCode;
		this.expDate = expDate;
	}

	public String getCardNum() {
		return cardNum;
	}
}
