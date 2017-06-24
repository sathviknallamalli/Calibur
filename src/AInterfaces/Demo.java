package AInterfaces;
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

					e1.printStackTrace();
				} catch (URISyntaxException e1) {

					e1.printStackTrace();
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

					e1.printStackTrace();
				} catch (URISyntaxException e1) {

					e1.printStackTrace();
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

		Calendar calendar = Calendar.getInstance();
		// String month, int day, String text, String site, String name, String
		// more

		// CBN BIRTHDAY
		if (calendar.get(Calendar.MONTH) == 3 && calendar.get(Calendar.DATE) == 20) {
			famousDay("April", 20,
					"Today is Chandra Babu Naidu's Birthday!! The Chief Minister of Andhra Pradesh in India. Click below for more.",
					"https://en.wikipedia.org/wiki/N._Chandrababu_Naidu", "Chandra Babu Naidu",
					"http://www.onthisday.com/birthdays/april/20");
		}
		// NEW YEAR
		else if (calendar.get(Calendar.MONTH) == 0 && calendar.get(Calendar.DATE) == 1) {
			famousDay("January", 1,
					"Today is New Years!! Let us enter the New Year with happiness and good wealth. Click below for more.",
					"https://en.wikipedia.org/wiki/New_Year", "New Years!",
					"http://www.onthisday.com/birthdays/january/1");
		}
		// HUGGING DAY
		else if (calendar.get(Calendar.MONTH) == 0 && calendar.get(Calendar.DATE) == 21) {
			famousDay("January", 21,
					"Today is National Hugging Day!! Go out and express your love by hugging someone! Click below for more.",
					"https://en.wikipedia.org/wiki/National_Hugging_Day", "Hugging Day!!",
					"http://www.onthisday.com/birthdays/january/21");
		}

		// STREET CHILDREN DAY
		else if (calendar.get(Calendar.MONTH) == 0 && calendar.get(Calendar.DATE) == 27) {
			famousDay("January", 27,
					"Today is International Street Children's Day. Let us all think of the less fortunate and help them. Click below for more.",
					"https://en.wikipedia.org/wiki/Jugend_Eine_Welt", "In Memory of..",
					"http://www.onthisday.com/birthdays/january/31");
		}
		// INDIA REPUBLIC DAY
		else if (calendar.get(Calendar.MONTH) == 0 && calendar.get(Calendar.DATE) == 26) {
			famousDay("January", 26,
					"Today is Republic Day in India!! This is when the Constitution came into effect. Click below for more.",
					"https://en.wikipedia.org/wiki/Republic_Day_(India)", "Republic Day",
					"http://www.onthisday.com/birthdays/january/26");
		}
		// GROUNDHOG REPUBLIC DAY
		else if (calendar.get(Calendar.MONTH) == 1 && calendar.get(Calendar.DATE) == 2) {
			famousDay("February", 2,
					"Today is Groundhog Day!! This is in celebration of a conspiracy of spring arriving early. Click below for more.",
					"https://en.wikipedia.org/wiki/Groundhog_Day", "Groundhog Day",
					"http://www.onthisday.com/birthdays/february/2");
		}
		// CANCER DAY
		else if (calendar.get(Calendar.MONTH) == 1 && calendar.get(Calendar.DATE) == 4) {
			famousDay("February", 4,
					"Today is World Cancer Day!! Let us all remember those who are infected and try to donate. Click below for more.",
					"https://en.wikipedia.org/wiki/World_Cancer_Day", "World Cancer Day",
					"http://www.onthisday.com/birthdays/february/4");
		}
		// VALENTINES
		else if (calendar.get(Calendar.MONTH) == 1 && calendar.get(Calendar.DATE) == 14) {
			famousDay("February", 14,
					"Today is Valentines Day!! The day of Love! Go out and find your valentine. Click below for more.",
					"https://en.wikipedia.org/wiki/Valentine%27s_Day", "Valentines Day",
					"http://www.onthisday.com/birthdays/february/14");
		}
		// SOCIAL JUSTICE
		else if (calendar.get(Calendar.MONTH) == 1 && calendar.get(Calendar.DATE) == 20) {
			famousDay("February", 20,
					"Today is Social Justice Day!! It is the day to celebrate social issues such a poverty and justice. Click below for more.",
					"https://en.wikipedia.org/wiki/World_Day_of_Social_Justice", "Social Justice Day",
					"http://www.onthisday.com/birthdays/february/20");
		}
		// THINKING DAY
		else if (calendar.get(Calendar.MONTH) == 1 && calendar.get(Calendar.DATE) == 22) {
			famousDay("February", 22,
					"Today is Thinking Day!! It is the day made by Scout Organizations to promote Global impact. Click below for more.",
					"https://en.wikipedia.org/wiki/World_Thinking_Day", "Thinking Day",
					"http://www.onthisday.com/birthdays/february/22");
		}
		// SUESS DAY
		else if (calendar.get(Calendar.MONTH) == 2 && calendar.get(Calendar.DATE) == 2) {
			famousDay("March", 2,
					"Today is Dr. Suess Day!! One of the greatest Children's Poet and the Author of Cult Classiscs books. Click below for more.",
					"https://en.wikipedia.org/wiki/Dr._Seuss", "Dr. Suess Day",
					"http://www.onthisday.com/birthdays/march/2");
		}
		// WILDLIFE DAY
		else if (calendar.get(Calendar.MONTH) == 2 && calendar.get(Calendar.DATE) == 3) {
			famousDay("March", 3,
					"Today is World Wildlife Day!! Let us take the time to appreciate nature and the environment. Click below for more.",
					"https://en.wikipedia.org/wiki/World_Wildlife_Day", "World Wildlife Day",
					"http://www.onthisday.com/birthdays/march/3");
		}
		// WOMEN DAY
		else if (calendar.get(Calendar.MONTH) == 2 && calendar.get(Calendar.DATE) == 8) {
			famousDay("March", 8,
					"Today is International Womens Day!! Appreciate the women in this World and their influence. Click below for more.",
					"https://en.wikipedia.org/wiki/International_Women%27s_Day", "Womens Day",
					"http://www.onthisday.com/birthdays/march/8");
		}
		// PI DAY
		else if (calendar.get(Calendar.MONTH) == 2 && calendar.get(Calendar.DATE) == 14) {
			famousDay("March", 14,
					"Today is Pi Day!! The date 3/14 which is 3.14 is a common Math Day. Click below for more.",
					"https://en.wikipedia.org/wiki/Pi_Day", "Pi Day", "http://www.onthisday.com/birthdays/march/14");
		}
		// PATRICKS DAY
		else if (calendar.get(Calendar.MONTH) == 2 && calendar.get(Calendar.DATE) == 17) {
			famousDay("March", 17,
					"Today is Saint Patricks Day!! The date in which Saint Patrick died, and celebrated by wearing Green. Click below for more.",
					"https://en.wikipedia.org/wiki/Saint_Patrick%27s_Day", "Saint Patricks Day",
					"http://www.onthisday.com/birthdays/march/17");
		}
		// HAPPINESS DAY
		else if (calendar.get(Calendar.MONTH) == 2 && calendar.get(Calendar.DATE) == 20) {
			famousDay("March", 20,
					"Today is International Happiness Day!! Let us live this live with pure happiness. Click below for more.",
					"https://en.wikipedia.org/wiki/International_Day_of_Happiness", "International Happiness Day",
					"http://www.onthisday.com/birthdays/march/20");
		}
		// COLOUR DAY
		else if (calendar.get(Calendar.MONTH) == 2 && calendar.get(Calendar.DATE) == 21) {
			famousDay("March", 21,
					"Today is International Colour Day!! Life is full of colors and let us make it colorful. Click below for more.",
					"https://en.wikipedia.org/wiki/International_Colour_Day", "International Colour Day",
					"http://www.onthisday.com/birthdays/march/21");
		}
		// WATER DAY
		else if (calendar.get(Calendar.MONTH) == 2 && calendar.get(Calendar.DATE) == 22) {
			famousDay("March", 22,
					"Today is World Water Day!! Water may seem abundant, but very rare in other places. Click below for more.",
					"https://en.wikipedia.org/wiki/World_Water_Day", "World Water Day",
					"http://www.onthisday.com/birthdays/march/22");
		}
		// FOOLS DAY
		else if (calendar.get(Calendar.MONTH) == 3 && calendar.get(Calendar.DATE) == 1) {
			famousDay("April", 1,
					"Today is April Fools!! Go out and fool someone, but stay in your limits. Click below for more.",
					"https://en.wikipedia.org/wiki/April_Fools%27_Day", "April Fools Day",
					"http://www.onthisday.com/birthdays/april/1");
		}
		// HELATH DAY
		else if (calendar.get(Calendar.MONTH) == 3 && calendar.get(Calendar.DATE) == 7) {
			famousDay("April", 7,
					"Today is World Health Day!! Make sure your health is in good condition and fit. Click below for more.",
					"https://en.wikipedia.org/wiki/World_Health_Day", "World Health Day",
					"http://www.onthisday.com/birthdays/april/7");
		}
		// DANCE DAY
		else if (calendar.get(Calendar.MONTH) == 3 && calendar.get(Calendar.DATE) == 29) {
			famousDay("April", 29,
					"Today is International Dance Day!! Dance is a great form of expression and art. Click below for more.",
					"https://en.wikipedia.org/wiki/International_Dance_Day", "Intenrational Dance Day",
					"http://www.onthisday.com/birthdays/april/29");
		}
		// EARTH DAY
		else if (calendar.get(Calendar.MONTH) == 3 && calendar.get(Calendar.DATE) == 22) {
			famousDay("April", 22,
					"Today is Earth Day!! Earth is a great and beautiful place to live, let us love our planet so much we show our care. Click below for more.",
					"https://en.wikipedia.org/wiki/Earth_Day", "Earth Day",
					"http://www.onthisday.com/birthdays/april/22");
		}
		// BOOK DAY APRIL
		else if (calendar.get(Calendar.MONTH) == 3 && calendar.get(Calendar.DATE) == 23) {
			famousDay("April", 23,
					"Today is World Book Day!! Books are a powerful tool that can turn the poor into rich and rich into poor. Click below for more.",
					"https://en.wikipedia.org/wiki/World_Book_Day", "Book Day",
					"http://www.onthisday.com/birthdays/april/23");
		}
		// BAAHUBALI DAY!!
		else if (calendar.get(Calendar.MONTH) == 3 && calendar.get(Calendar.DATE) == 27) {
			famousDay("April", 27,
					"Today is Baahubali Day!! Today is the day that Baahubali was released!! It is a magnum Opus film that created records in the Film Industry. Click below for more.",
					"https://en.wikipedia.org/wiki/Baahubali_2:_The_Conclusion", "Baahubali Day",
					"http://www.onthisday.com/birthdays/april/27");
		} else if (calendar.get(Calendar.MONTH) == 3 && calendar.get(Calendar.DATE) == 28) {
			famousDay("April", 28,
					"Today is Baahubali Day!! Today is the day that Baahubali was released!! It is a magnum Opus film that created records in the Film Industry. Click below for more.",
					"https://en.wikipedia.org/wiki/Baahubali_2:_The_Conclusion", "Baahubali Day",
					"http://www.onthisday.com/birthdays/april/28");
		}

		// MAY DAY DAY
		else if (calendar.get(Calendar.MONTH) == 4 && calendar.get(Calendar.DATE) == 1) {
			famousDay("May", 1,
					"Today is May Day!! It is an ancient Spring Festival that is celebrated in the Northern Hemisphere. Click below for more.",
					"https://en.wikipedia.org/wiki/May_Day", "May Day", "http://www.onthisday.com/birthdays/may/1");
		}
		// SUN DAY
		else if (calendar.get(Calendar.MONTH) == 4 && calendar.get(Calendar.DATE) == 3) {
			famousDay("May", 3,
					"Today is Sun Day!! Today is International Sun Day to celebrate solar power established by Jimmy Carter. Click below for more.",
					"https://en.wikipedia.org/wiki/Sun_Day", "Sun Day", "http://www.onthisday.com/birthdays/may/3");
		}
		// STAR WARS DAY
		else if (calendar.get(Calendar.MONTH) == 4 && calendar.get(Calendar.DATE) == 4) {
			famousDay("May", 4,
					"Today is Star Wars Day!! This particular day was chosen because of the line 'May the Fourth Be With You'. Click below for more.",
					"https://en.wikipedia.org/wiki/Star_Wars_Day", "Star Wars Day",
					"http://www.onthisday.com/birthdays/may/4");
		}
		// CINSO DE MAYO DAY
		else if (calendar.get(Calendar.MONTH) == 4 && calendar.get(Calendar.DATE) == 5) {
			famousDay("May", 5,
					"Today is Cinco De Mayo!! It is to celebrate the battle won by the Mexican Army on May 5th. Click below for more.",
					"https://en.wikipedia.org/wiki/Cinco_de_Mayo", "Cinco De Mayo",
					"http://www.onthisday.com/birthdays/may/5");
		}
		// INTENRATION NO DIET
		else if (calendar.get(Calendar.MONTH) == 4 && calendar.get(Calendar.DATE) == 6) {
			famousDay("May", 6,
					"Today is International No Diet Day!! Celebrate your health and life by appreciating food and no being restricted by you favorite foods. Click below for more.",
					"https://en.wikipedia.org/wiki/International_No_Diet_Day", "International No Diet",
					"http://www.onthisday.com/birthdays/may/6");
		}
		// VICTORY IN EUROPE
		else if (calendar.get(Calendar.MONTH) == 4 && calendar.get(Calendar.DATE) == 8) {
			famousDay("May", 8,
					"Today is Victory in Europe Day!! This is the day where Europe made allies with the Nazi Government, and it marked the end of WWII. Click below for more.",
					"https://en.wikipedia.org/wiki/Victory_in_Europe_Day", "Victory in Europe",
					"http://www.onthisday.com/birthdays/may/8");
		}
		// TEACHERS DAY
		else if (calendar.get(Calendar.MONTH) == 4 && calendar.get(Calendar.DATE) == 9) {
			famousDay("May", 9,
					"Today is Teachers Day!! Let us appreciate how much time our teachers spent and the invalubale information they shared with us. Click below for more.",
					"https://www.nationaldaycalendar.com/national-teacher-appreciation-day-tuesday-of-the-first-full-week-in-may/",
					"Teachers Day", "http://www.onthisday.com/birthdays/may/9");
		}

		// TURTLE DAY
		else if (calendar.get(Calendar.MONTH) == 4 && calendar.get(Calendar.DATE) == 23) {
			famousDay("May", 23,
					"Today is World Turtle Day!! It is to bring awareness to the Turtles and their value to nature. Click below for more.",
					"https://en.wikipedia.org/wiki/World_Turtle_Day", "World Turtle Day",
					"http://www.onthisday.com/birthdays/may/23");
		}
		// GEEK DAY
		else if (calendar.get(Calendar.MONTH) == 4 && calendar.get(Calendar.DATE) == 25) {
			famousDay("May", 25,
					"Today is Geek Pride Day!! It is to promote geek culture and originated from Spain. Click below for more.",
					"https://en.wikipedia.org/wiki/Geek_Pride_Day", "Geek Pride Day",
					"http://www.onthisday.com/birthdays/may/25");
		}
		// ENVIRONEMNT DAY
		else if (calendar.get(Calendar.MONTH) == 5 && calendar.get(Calendar.DATE) == 4) {
			famousDay("June", 5,
					"Today is World Environment Day. Let us all appreciate the conditions we live in and thank Mother Nature. Click below for more.",
					"https://en.wikipedia.org/wiki/World_Environment_Day", "World Environment Day",
					"http://www.onthisday.com/birthdays/june/5");
		}
		// MICROSOFT DAY
		else if (calendar.get(Calendar.MONTH) == 3 && calendar.get(Calendar.DATE) == 4) {
			famousDay("April", 4,
					"Today is when Microsoft was Founded!! Most of the devices you use are from this company, let us thank them. Click below for more.",
					"https://en.wikipedia.org/wiki/Microsoft", "Microsoft",
					"http://www.onthisday.com/birthdays/april/4");
		}
		// GOOGLE DAY
		else if (calendar.get(Calendar.MONTH) == 8 && calendar.get(Calendar.DATE) == 4) {
			famousDay("September", 8,
					"Today is when Google was Founded!! A small search engine that expanded to email, phones, computer and more! Click below for more.",
					"https://en.wikipedia.org/wiki/Google", "Google", "http://www.onthisday.com/birthdays/september/8");
		}
		// JAI BALLAYA
		else if (calendar.get(Calendar.MONTH) == 5 && calendar.get(Calendar.DATE) == 11) {
			famousDay("June", 5,
					"Today is Nanadamuri Balakrishnas Birthday! He is in Indian film actor and son of the notable politician NTR. Click below for more.",
					"https://en.wikipedia.org/wiki/Nandamuri_Balakrishna", "Jai Ballaya!",
					"http://www.onthisday.com/birthdays/june/11");
		}
		// SUMMER SOLSITCE
		else if (calendar.get(Calendar.MONTH) == 5 && calendar.get(Calendar.DATE) == 21) {
			famousDay("June", 5,
					"Today is the Summer Solstice! The first day of Summer has begun, and lets enjoy the amazing start of a new season. Click below for more.",
					"https://www.google.com/search?q=summer+solstice+2017&oi=ddle&ct=summer-solstice-2017-northern-hemisphere-4910274078310400-law&hl=en",
					"Summer Solstice", "http://www.onthisday.com/birthdays/june/21");
		}

	}

}
