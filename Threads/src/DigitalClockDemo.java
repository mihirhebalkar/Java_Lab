import javax.swing.*;
import java.util.Date;
import java.awt.*;

public class DigitalClockDemo extends JFrame
implements Runnable {
	// we cannot extend both Thread and Jframe bcoz Java doesn't allow multiple inheritance
	// so we implement Runnable
	
	JLabel clock;
	Date d;
	String dt_str;
	
	DigitalClockDemo() {

		
		
		d = new Date();
		dt_str = String.valueOf(d);
		dt_str = dt_str.substring(11,19);

		clock = new JLabel(dt_str);
		clock.setFont(new Font("Times New Roman", Font.BOLD,28));
		this.add(clock);
		this.setSize(300,300);
		this.setVisible(true);
		this.pack();
		Thread t =new Thread(this);
		t.start();
		// use multi-threading to display dynamic time that is updated every second
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				d = new Date();
				dt_str = String.valueOf(d);
				dt_str = dt_str.substring(11,19);
				clock.setText(dt_str);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}
	
	public static void main(String[] args) {
		DigitalClockDemo d = new DigitalClockDemo();
	}
	
}
