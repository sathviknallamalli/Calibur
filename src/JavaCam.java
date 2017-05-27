import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.bytedeco.javacpp.opencv_core.Mat;
import org.bytedeco.javacpp.opencv_highgui.VideoCapture;
import org.opencv.core.MatOfByte;

public class JavaCam extends JFrame {

	// private DaemonThread myThread = null;
	int count = 0;
	VideoCapture webSource = null;

	Mat frame = new Mat();
	MatOfByte mem = new MatOfByte();

	/*
	 * class DaemonThread implements Runnable { protected volatile boolean
	 * runnable = false;
	 * 
	 * public void run() { synchornized(this) { while(runnable) {
	 * if(webSource.grab()) { try{ webSource.retrieve(frame);
	 * Highgui.imencode(".bmp",frame,mem); Image im = ImageIO.read(new
	 * ByteArrayInputStream(mem.toArray()));
	 * 
	 * JPanel panel; BufferedImage buff = (BufferedImage) im; Graphics g =
	 * panel.getGraphics();
	 * 
	 * if(g.drawImage(buff, 0, 0,
	 * getWidth(),getHeight()-150,0,0,buff.getWidth(),buff.getHeight(),null));
	 * if(runnable == false) { System.out.println("Going to wait()");
	 * this.wait(); } }catch(Exception ex) { System.out.println("Error"); } } }
	 * } } }
	 */

	public JavaCam() {
		getContentPane().setLayout(null);

		JButton btnStart = new JButton("Start");
		btnStart.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnStart.setBounds(103, 313, 152, 35);
		getContentPane().add(btnStart);

		JButton btnPause = new JButton("Pause");
		btnPause.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnPause.setBounds(466, 313, 152, 35);
		getContentPane().add(btnPause);

		JPanel panel = new JPanel();
		panel.setBounds(27, 11, 641, 274);
		getContentPane().add(panel);
	}

}
