package subsystem;

import common.exception.PaymentException;
import common.exception.UnrecognizedException;
import model.payment.paymentCard.creditCard.CreditCard;
import model.payment.transaction.PaymentTransaction;

/**
 * The {@code InterbankInterface} class is used to communicate with the
 * {@link InterbankSubsystem InterbankSubsystem} to make transaction
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
public interface InterbankInterface {

	/**
	 * Pay order, and then return the payment transaction
	 * 
	 * @param card     - the credit card used for payment
	 * @param amount   - the amount to pay
	 * @param contents - the transaction contents
	 * @return {@link PaymentTransaction PaymentTransaction} - if the payment is
	 *         successful
	 * @throws PaymentException      if responded with a pre-defined error code
	 * @throws UnrecognizedException if responded with an unknown error code or
	 *                               something goes wrong
	 */
	public abstract PaymentTransaction payOrder(CreditCard card, int amount, String contents)
			throws PaymentException, UnrecognizedException;

	/**
	 * Refund, and then return the payment transaction
	 * 
	 * @param card     - the credit card which would be refunded to
	 * @param amount   - the amount to refund
	 * @param contents - the transaction contents
	 * @return {@link PaymentTransaction PaymentTransaction} - if the payment is
	 *         successful
	 * @throws PaymentException      if responded with a pre-defined error code
	 * @throws UnrecognizedException if responded with an unknown error code or
	 *                               something goes wrong
	 */
	public abstract PaymentTransaction refund(CreditCard card, int amount, String contents)
			throws PaymentException, UnrecognizedException;

}
