package subsystem;

import common.exception.PaymentException;
import common.exception.UnrecognizedException;
import model.payment.paymentCard.creditCard.CreditCard;
import model.payment.transaction.PaymentTransaction;
import subsystem.interbank.InterbankSubsystemController;

/**
 * The {@code InterbankSubsystem} class is used to communicate with the
 * Interbank to make transaction.
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
public class InterbankSubsystem implements InterbankInterface {

	/**
	 * Represent the controller of the subsystem
	 */
	private InterbankSubsystemController ctrl;

	/**
	 * Initializes a newly created {@code InterbankSubsystem} object so that it
	 * represents an Interbank subsystem.
	 */
	public InterbankSubsystem() {
		String str = new String();
		this.ctrl = new InterbankSubsystemController();
	}

	/**
	 * @see InterbankInterface#payOrder(CreditCard, int, String)
	 */
	public PaymentTransaction payOrder(CreditCard card, int amount, String contents)
			throws PaymentException, UnrecognizedException {
		return ctrl.payDeposit(card, amount, contents);
	}

	/**
	 * @see InterbankInterface#refund(CreditCard, int, String)
	 */
	public PaymentTransaction refund(CreditCard card, int amount, String contents)
			throws PaymentException, UnrecognizedException {
		PaymentTransaction transaction = ctrl.refund(card, amount, contents);
		return transaction;
	}
}
