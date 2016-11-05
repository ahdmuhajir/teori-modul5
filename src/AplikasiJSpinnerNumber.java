import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class AplikasiJSpinnerNumber extends JFrame {
	JSpinner spin = new JSpinner();
	JTextField txspin = new JTextField();
	JLabel nomor= new JLabel("Nomor :");
	Color c = new Color(243, 156, 18);
	
	public AplikasiJSpinnerNumber() {
		setTitle("Aplikasi Jspinner Number");
		setSize(300,110);
		setLocation(10,10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	
	}
	void komponenVisual(){
		getContentPane().setLayout(null);
		getContentPane().setBackground(c);
		getContentPane().add(nomor);
		nomor.setBounds(10,10,50,20);
		
		getContentPane().add(txspin);
		txspin.setBounds(70, 10, 150, 50);
		txspin.setEditable(false);
		
		getContentPane().add(spin);
		spin.setBounds(70,10,150,50);
		spin.setFont(new Font("Arial", Font.BOLD, 15));
		spin.setEditor(txspin);
		setVisible(true);
	}
	
	void action(){
		spin.addChangeListener(new ChangeListener() {
			
			public void stateChanged(ChangeEvent e) {
				Object obj = spin.getValue();
				txspin.setText(obj.toString());
				
			}
		});
	}
	
	public static void main(String[] args) {
		AplikasiJSpinnerNumber ajn = new AplikasiJSpinnerNumber();
		ajn.komponenVisual();
		ajn.action();
	}
}
