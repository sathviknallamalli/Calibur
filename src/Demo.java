
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.ibm.icu.util.Calendar;

import AInterfaces.Browser;
import AInterfaces.Home;

public class Demo {

	public static void famousDay(String month, int day, String text, String site, String name, String more) {

		Calendar calendar = Calendar.getInstance();

		JFrame frame = new JFrame();
		frame.setSize(372, 141);
		frame.setLocation(430, 220);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);

		JLabel ae = new JLabel();
		ae.setVerticalAlignment(SwingConstants.TOP);
		ae.setFont(new Font("Calibri", Font.BOLD, 14));
		frame.getContentPane().add(ae);
		ae.setText("<html>" + text);
		ae.setBounds(10, 11, 336, 51);

		JButton bg = new JButton();
		bg.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frame.getContentPane().add(bg);

		bg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String[] arguments = { "1", "2", "3" };
				try {
					Browser.main(arguments, site);
				} catch (IOException e1) {

				} catch (URISyntaxException e1) {

				}
			}
		});

		String months[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		String date = months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE);

		JButton other = new JButton(date + " Birthdays");
		other.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		frame.getContentPane().add(other);

		bg.setText(name);
		bg.setBounds(40, 65, 111, 25);
		other.setBounds(170, 65, 165, 25);

		other.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String[] arguments = { "1", "2", "3" };
				try {
					Browser.main(arguments, more);
				} catch (IOException e1) {

				} catch (URISyntaxException e1) {

				}
			}
		});

	}

	public static void main(String[] args) {
		Home h = new Home();
		h.setResizable(false);
		h.setVisible(true);
		h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		h.setLocation(200, 50);
		h.setSize(803, 313);
		Dates.dateChecker();
		// String month, int day, String text, String site, String name, String
		// more

	}

}
