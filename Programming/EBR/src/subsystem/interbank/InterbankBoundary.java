package subsystem.interbank;

import common.exception.UnrecognizedException;
import utils.API;

/**
 * The {@code InterbankSubsystem} class is used to communicate with the
 * Interbank to make transaction.
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
public class InterbankBoundary {

	/**
	 * call API to make HTTP request
	 * @param url {@link java.net.URL}
	 * @param data body of request
	 * @return Http respond
	 */
	String query(String url, String data) {
		String response = null;
		try {
			response = API.post(url, data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new UnrecognizedException();
		}
		return response;
	}

}
