import com.ibm.icu.util.Calendar;

public class sample {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get((Calendar.MONTH));
		System.out.println(month);
	}
}
