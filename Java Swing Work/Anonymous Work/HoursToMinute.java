import javax.swing.*;
import java.awt.event.*;

class HoursToMinute extends JFrame {
	JFrame jFrame = new JFrame();
	JLabel jLabel = new JLabel("Enter Hours");
	JButton jButton = new JButton("convert to Minute");
	JLabel jLabel2 = new JLabel("Result:");
	JTextField jTextfield = new JTextField();
	JLabel jLabel3 = new JLabel();
	
	
	HoursToMinute() {
		jFrame.setLayout(null);
		jFrame.setBounds(0,0,300,250);
		jLabel.setBounds(20,20,140,20);
		jButton.setBounds(70,70,140,30);
		jLabel2.setBounds(20,130,150,20);
		jTextfield.setBounds(100,15,80,30);
		jLabel3.setBounds(80,125,80,30);
		
		
		jFrame.add(jLabel);
		jFrame.add(jButton);
		jFrame.add(jLabel2);
		jFrame.add(jTextfield);
		jFrame.add(jLabel3);
		
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hour = jTextfield.getText();
				int hours = Integer.parseInt(hour);
				int result = hours * 60;
				jLabel3.setText(result+" minute");
			}
		});
		
		jFrame.setVisible(true);
		
		
	}
	
	
		
	public static void main(String arg[]) {
		new HoursToMinute();
		}

}