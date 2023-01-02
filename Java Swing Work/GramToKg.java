import javax.swing.*;
import java.awt.event.*;

class GramToKg extends JFrame implements ActionListener {
	JFrame jFrame = new JFrame();
	JLabel jLabel = new JLabel("Enter Gram");
	JButton jButton = new JButton("convert to KiloGram");
	JLabel jLabel2 = new JLabel("Result:");
	JTextField jTextfield = new JTextField();
	JLabel jLabel3 = new JLabel();
	

	GramToKg() {
		jFrame.setLayout(null);
		jFrame.setBounds(0,0,300,250);
		jLabel.setBounds(20,20,140,20);
		jButton.setBounds(70,70,160,30);
		jLabel2.setBounds(20,130,150,20);
		jTextfield.setBounds(100,15,80,30);
		jLabel3.setBounds(80,125,80,30);
		
		
		jFrame.add(jLabel);
		jFrame.add(jButton);
		jFrame.add(jLabel2);
		jFrame.add(jTextfield);
		jFrame.add(jLabel3);
		
		jFrame.setVisible(true);
		
		jButton.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jButton) {
			String gr = jTextfield.getText();
			int grm = Integer.parseInt(gr);
			double result = grm * 0.001;
			jLabel3.setText(result+"");
		  }
	}
	public static void main(String arg[]) {
		new GramToKg();
		}

}