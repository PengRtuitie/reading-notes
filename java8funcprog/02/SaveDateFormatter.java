import java.text.SimpleDateFormat;

import javax.swing.text.DateFormatter;

/**
 * �̰߳�ȫ��dateFormatter��
 * @author Lenovo
 *
 */
public class SaveDateFormatter {

	public static ThreadLocal<DateFormatter> formatter = 
										ThreadLocal.withInitial(
										() -> new DateFormatter(new SimpleDateFormat("dd-MM-yyyy")));
}
