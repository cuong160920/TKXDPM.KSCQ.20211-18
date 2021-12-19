package controller;

import model.bike.Bike;
import model.bike.BikeManager;
import model.dock.Dock;
import model.dock.DockManager;
import model.invoice.Invoice;
import model.invoice.InvoiceManager;

import java.util.ArrayList;

/**
 * class for Return dock selection
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
public class ReturningDockSelectionController extends BaseController{
    /**
     * This method is used to get dock list
     * @return list of dock
     */
    public ArrayList<Dock> getDockList() {
        return DockManager.getInstance().getDockList();
    }

    /**
     * This method is used to get dock list by using keyword
     * @param keyword - keyword
     * @return list of dock corresponding to keyword
     */
    public ArrayList<Dock> getDockListByKeyword(String keyword) {
        return DockManager.getInstance().searchDockByKeyword(keyword);
    }

    public Invoice createInvoice(String id) {
        return InvoiceManager.getInstance().createInvoice(id);
    }

    public void returnBikeToDock(Bike bike, Dock dock) {
        BikeManager.getInstance().getBikeById(bike.getId()).putBikeInDock(dock);
    }
}
