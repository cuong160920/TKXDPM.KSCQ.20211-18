package common.exception.cardException;

/**
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
public class CardUsedException extends FormException {
	public CardUsedException() {
		super("Card used for another session");
	}
}
