package GeometryTopics;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import studentHub.MathCalculators.BasicGeometryCalcs;

public class Volumes extends JFrame {
	private JTextField param1;
	private JTextField param2;

	public Volumes() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Volume Calculator\r\n");
		title.setFont(new Font("Castellar", Font.PLAIN, 25));
		title.setBounds(223, 11, 330, 42);
		getContentPane().add(title);

		JLabel info = new JLabel(
				"Choose the desired shape and enter the proper variables needed to calculate the shape");
		info.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		info.setBounds(178, 52, 420, 14);
		getContentPane().add(info);

		JLabel result = new JLabel();
		result.setFont(new Font("Times New Roman", Font.BOLD, 13));
		result.setBounds(26, 210, 354, 23);
		getContentPane().add(result);

		param1 = new JTextField();
		getContentPane().add(param1);
		param1.setColumns(10);

		JLabel formula = new JLabel("<html>\r\n");
		formula.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		formula.setBounds(10, 144, 220, 54);
		getContentPane().add(formula);
		
		JLabel lab1 = new JLabel();
		lab1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lab1.setBounds(241, 144, 118, 14);
		getContentPane().add(lab1);

		JButton cube = new JButton("Cube\r\n");
		cube.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		cube.setBounds(175, 86, 108, 31);
		getContentPane().add(cube);

		JButton btnCylinder = new JButton("Cylinder\r\n");

		btnCylinder.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnCylinder.setBounds(293, 86, 108, 31);
		getContentPane().add(btnCylinder);

		JButton btnCone = new JButton("Cone\r\n");

		btnCone.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnCone.setBounds(411, 86, 108, 31);
		getContentPane().add(btnCone);
		

		JButton reset = new JButton("Reset");
		reset.setFont(new Font("Times New Roman", Font.PLAIN, 13));
	
		getContentPane().add(reset);

		JButton btnSphere = new JButton("Sphere");

		btnSphere.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnSphere.setBounds(529, 86, 108, 31);
		getContentPane().add(btnSphere);

		JButton btnPyramid = new JButton("Pyramid");

		btnPyramid.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnPyramid.setBounds(649, 86, 108, 31);
		getContentPane().add(btnPyramid);

		param2 = new JTextField();
		param2.setColumns(10);
		getContentPane().add(param2);

		JTextField param3 = new JTextField();
		param3.setColumns(10);
		getContentPane().add(param3);

		JLabel lab2 = new JLabel();
		lab2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lab2.setBounds(241, 175, 118, 14);
		getContentPane().add(lab2);

		JLabel lab3 = new JLabel();
		lab3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lab3.setBounds(241, 206, 118, 14);
		getContentPane().add(lab3);

		JButton btnNewButton_1 = new JButton("CALCULATE!");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));

		// prisim button selected
		JButton btnNewButton = new JButton("Rectangular Prisim");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				result.setText("");
				reset.setBounds(481, 189, 139, 31);
				
				reset.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent arg0) {
						param1.setText("");
						param2.setText("");
						param3.setText("");
						result.setText("");
					}
				});
				
				param1.setBounds(361, 141, 86, 20);
				param2.setBounds(361, 172, 86, 20);
				param3.setBounds(361, 203, 86, 20);
				lab1.setText("Length");
				lab2.setText("Width");
				lab3.setText("Height");
				formula.setText("<html>The formula to calculate the volume of a rectangular prisim is length * width * height");
				
				btnNewButton_1.setBounds(625, 197, 118, 23);
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						BasicGeometryCalcs bc = new BasicGeometryCalcs();
						double vol = bc.prisimVol(Double.parseDouble(param1.getText()),
								Double.parseDouble(param2.getText()), Double.parseDouble(param3.getText()));
						result.setText("The volume of the prisim is " + vol);
					}
				});
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(26, 86, 139, 31);
		getContentPane().add(btnNewButton);
		getContentPane().add(btnNewButton_1);
		
		
	

		cube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				formula.setText("<html>In order to calculate the volume of a cube, it is simply to cube the edge length.");
				result.setText("");
				param1.setBounds(361, 141, 86, 20);
				param1.setText("");
				param2.setBounds(0,0,0,0);
				param3.setBounds(0, 0, 0, 0);
				lab1.setText("Edge Length");
				lab2.setText("");
				lab3.setText("");
				
				reset.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent arg0) {
						param1.setText("");
						result.setText("");
					}
				});
				btnNewButton_1.setBounds(625, 197, 118, 23);
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						BasicGeometryCalcs bc = new BasicGeometryCalcs();
						double vol = bc.cubeVol(Double.parseDouble(param1.getText()));
						result.setText("The volume of the cube is " + vol);
					}
				});
			}
		});
		btnCylinder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				param1.setBounds(361, 141, 86, 20);
				param2.setBounds(361, 172, 86, 20);
				param1.setText("");
				param2.setText("");
				result.setText("");
				reset.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent arg0) {
						param1.setText("");
						param2.setText("");
						result.setText("");
					}
				});
				formula.setText("<html>The formula to calculate the volume of a cylinder is pi*r*r*h");
				param3.setBounds(0, 0, 0, 0);
				lab1.setText("Radius");
				lab2.setText("Height");
				lab3.setText("");
				btnNewButton_1.setBounds(625, 197, 118, 23);
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						BasicGeometryCalcs bc = new BasicGeometryCalcs();
						double vol = bc.cylVol(Double.parseDouble(param1.getText()), Double.parseDouble(param2.getText()));
						result.setText("The volume of the cylinder is " + vol);
					}
				});
			}
		});
		btnCone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				param1.setBounds(361, 141, 86, 20);
				param2.setBounds(361, 172, 86, 20);

				lab1.setText("Radius");
				lab2.setText("Height");
				lab3.setText("");
				btnNewButton_1.setBounds(625, 197, 118, 23);
			}
		});
		btnSphere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				param1.setBounds(361, 141, 86, 20);
				param2.setBounds(0, 0, 0, 0);
				lab1.setText("Radius");
				lab2.setText("");
				lab3.setText("");
				btnNewButton_1.setBounds(625, 197, 118, 23);
			}
		});
		btnPyramid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				param1.setBounds(361, 141, 86, 20);
				param2.setBounds(361, 172, 86, 20);
				lab1.setText("Base Length");
				lab2.setText("Height");
				lab3.setText("");
				btnNewButton_1.setBounds(625, 197, 118, 23);
			}
		});
	}

	public void newClass() {

		setSize(792, 283);
		setLocation(400, 300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
