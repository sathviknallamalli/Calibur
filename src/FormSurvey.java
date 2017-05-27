import java.awt.EventQueue;

import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import javax.swing.JButton;
import javax.swing.JTable;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import com.ibm.icu.util.Calendar;

import Machines.Audio;
import studentHub.Conversions.*;
import java.awt.SystemColor;
import GraphTemplates.*;
import javax.swing.JRadioButton;
import javax.swing.JProgressBar;

public class FormSurvey {

	private JFrame frame;
	private JTextField newCol;
	private JTextField sampq;
	public JProgressBar bar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormSurvey window = new FormSurvey();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FormSurvey() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frame = new JFrame("Chart Generator");
		frame.getContentPane().setBackground(new Color(255, 204, 51));
		frame.getContentPane().setLayout(null);
		frame.setSize(891, 280);
		frame.setLocation(300, 150);

		JLabel lblChartGenerator = new JLabel("Forms & Survey");
		lblChartGenerator.setFont(new Font("Castellar", Font.PLAIN, 34));
		lblChartGenerator.setBounds(275, 11, 322, 42);
		frame.getContentPane().add(lblChartGenerator);

		JLabel lblinitializeTheSize = new JLabel(
				"<html>Create a list of all the questions you want to make and turn it into a survey that everyone can take here!");
		lblinitializeTheSize.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblinitializeTheSize.setBounds(152, 53, 571, 23);
		frame.getContentPane().add(lblinitializeTheSize);

		JLabel lblSetSizeOf = new JLabel("Template:");
		lblSetSizeOf.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSetSizeOf.setBounds(11, 83, 142, 23);
		frame.getContentPane().add(lblSetSizeOf);

		JButton make = new JButton("Make a Form Yourself!");
		make.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		make.setBounds(620, 129, 159, 31);
		frame.getContentPane().add(make);

		sampq = new JTextField();
		sampq.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		sampq.setEditable(false);
		sampq.setText("Enter Question Here");
		sampq.setBounds(11, 135, 120, 20);
		frame.getContentPane().add(sampq);
		sampq.setColumns(10);

		JLabel lblQuestion = new JLabel("Question:");
		lblQuestion.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblQuestion.setBounds(11, 110, 72, 20);
		frame.getContentPane().add(lblQuestion);

		JLabel lblOptions = new JLabel("Options");
		lblOptions.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblOptions.setBounds(11, 160, 72, 20);
		frame.getContentPane().add(lblOptions);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Sample Option1");
		rdbtnNewRadioButton.setEnabled(false);
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		rdbtnNewRadioButton.setBackground(new Color(255, 204, 51));
		rdbtnNewRadioButton.setBounds(11, 179, 109, 20);
		frame.getContentPane().add(rdbtnNewRadioButton);

		JRadioButton rdbtnSampleOption = new JRadioButton("Sample Option2");
		rdbtnSampleOption.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		rdbtnSampleOption.setEnabled(false);
		rdbtnSampleOption.setBackground(new Color(255, 204, 51));
		rdbtnSampleOption.setBounds(122, 179, 109, 20);
		frame.getContentPane().add(rdbtnSampleOption);

		JRadioButton rdbtnSampleOption_1 = new JRadioButton("Sample Option3");
		rdbtnSampleOption_1.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		rdbtnSampleOption_1.setEnabled(false);
		rdbtnSampleOption_1.setBackground(new Color(255, 204, 51));
		rdbtnSampleOption_1.setBounds(233, 179, 109, 20);
		frame.getContentPane().add(rdbtnSampleOption_1);

		JRadioButton rdbtnSampleOption_2 = new JRadioButton("Sample Option4");
		rdbtnSampleOption_2.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		rdbtnSampleOption_2.setEnabled(false);
		rdbtnSampleOption_2.setBackground(new Color(255, 204, 51));
		rdbtnSampleOption_2.setBounds(344, 179, 109, 20);
		frame.getContentPane().add(rdbtnSampleOption_2);

		bar = new JProgressBar();
		bar.setForeground(new Color(255, 204, 51));
		bar.setStringPainted(true);
		bar.setBounds(605, 172, 188, 23);
		frame.getContentPane().add(bar);

		make.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

	}

	public void newClass() {

		frame.setSize(frame.getSize());
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

}
