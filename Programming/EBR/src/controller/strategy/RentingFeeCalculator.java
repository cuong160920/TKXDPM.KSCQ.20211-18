package controller.strategy;

import model.invoice.Invoice;
import model.session.Session;

/**
 * abstract class for calculate fee
 *
 * @author HHDang
 * <p>
 * created_at: 15/12/2021
 * <p>
 * project name: EBR
 * <p>
 * teacher's name: Dr. Nguyen Thi Thu Trang
 * <p>
 * class name: KSCQ.CNTT 03 K63
 * <p>
 * helpers: teacher's teaching assistants
 */
public abstract class RentingFeeCalculator {

    /**
     * Calculate renting fee for a session
     * @param session {@link Session} session to be calculated for
     * @return calculated fee
     */
    public abstract int calculateCurrentRentingFees(Session session);

    /**
     * Calculate renting fee for a session
     * @param invoice {@link Invoice} invoice to be calculated for
     * @return calculated fee
     */
    public abstract int calculateTotalFees(Invoice invoice);
}
