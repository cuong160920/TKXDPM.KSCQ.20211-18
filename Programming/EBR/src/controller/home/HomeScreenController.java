package controller.home;

import controller.BaseController;
import model.dock.Dock;
import model.dock.DockManager;

import java.util.ArrayList;

/**
 * class for Home Screen
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
public class HomeScreenController extends BaseController {
    public HomeScreenController() {
    }

    /**
     * This method is used to get list of docks for the home screen to display
     * @author mHoang
     * @return list of dock
     */
    public ArrayList<Dock> getDockList() {
        return DockManager.getInstance().getDockList();
    }
}
