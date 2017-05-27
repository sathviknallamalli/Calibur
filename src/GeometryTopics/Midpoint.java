package GeometryTopics;
import java.awt.Font;
import studentHub.MathCalculators.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Midpoint extends JFrame {
	private JTextField X1;
	private JTextField Y1;
	private JTextField X2;
	private JTextField Y2;
	private JLabel lblNewLabel;
	private JLabel lblX;
	private JLabel lblY;
	private JLabel lblY_1;
	private JLabel label;
	private JLabel label_1;
	private JLabel lblNewLabel_1;
	public Midpoint() {
		getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Midpoint");
		title.setFont(new Font("Castellar",Font.PLAIN,25));
		title.setBounds(135, 11, 153, 42);
		getContentPane().add(title);
		
		X1 = new JTextField();
		X1.setBounds(44, 80, 86, 20);
		getContentPane().add(X1);
		X1.setColumns(10);
		
		Y1 = new JTextField();
		Y1.setBounds(193, 80, 86, 20);
		getContentPane().add(Y1);
		Y1.setColumns(10);
		
		X2 = new JTextField();
		X2.setBounds(44, 134, 86, 20);
		getContentPane().add(X2);
		X2.setColumns(10);
		
		Y2 = new JTextField();
		Y2.setBounds(193, 134, 86, 20);
		getContentPane().add(Y2);
		Y2.setColumns(10);
		
		JButton Calc = new JButton("Calculate");
		
		Calc.setBounds(313, 185, 89, 23);
		getContentPane().add(Calc);
		
		JLabel result = new JLabel("Result");
		result.setBounds(166, 219, 163, 14);
		getContentPane().add(result);
		
		lblNewLabel = new JLabel("X1");
		lblNewLabel.setBounds(83, 95, 19, 28);
		getContentPane().add(lblNewLabel);
		
		lblX = new JLabel("X2");
		lblX.setBounds(83, 151, 19, 28);
		getContentPane().add(lblX);
		
		lblY = new JLabel("Y2");
		lblY.setBounds(231, 151, 19, 28);
		getContentPane().add(lblY);
		
		lblY_1 = new JLabel("Y1");
		lblY_1.setBounds(231, 95, 19, 28);
		getContentPane().add(lblY_1);
		
		label = new JLabel(",");
		label.setBounds(155, 83, 19, 28);
		getContentPane().add(label);
		
		label_1 = new JLabel(",");
		label_1.setBounds(155, 137, 19, 28);
		getContentPane().add(label_1);
		
		lblNewLabel_1 = new JLabel("Enter the 2 coordinates you want to find the midpoint of");
		lblNewLabel_1.setFont(new Font("Times New Roman",Font.ITALIC,12));
		lblNewLabel_1.setBounds(61, 52, 274, 14);
		getContentPane().add(lblNewLabel_1);
		
		Calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CoordinateGridGeometryCalcs c = new CoordinateGridGeometryCalcs();
				double xMid = c.midpointX(X1.getText(), X2.getText());
				double yMid = c.midpointY(Y1.getText(), Y2.getText());
				
						
				result.setText("The midpoint is (" + xMid + "," + yMid + ")");
			}
		});
		
	}

	
	
	public void newClass(){
	
	setSize(452,300);
	setLocation(600,300);
	setVisible(true);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);

}

}
